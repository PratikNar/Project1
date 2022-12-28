package jwtutil;


import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.springframework.stereotype.Component;


import io.jsonwebtoken.Claims;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	
	private String secret = "some secret key";
	public String generateToken(String subject) {
		return Jwts	.builder().setSubject(subject)
					.setIssuer("Spring Security")
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(15)))
					.signWith(SignatureAlgorithm.HS512, secret)
					.compact();
	}
	public Claims getClaims(String token) {
		return Jwts.parser().setSigningKey(secret.getBytes())
				.parseClaimsJws(token)
				.getBody();
	}
	
	public Date getExpDate(String token) {
		return getClaims(token).getExpiration();
	}
	
	public String getEmail(String token) {
		return getClaims(token).getSubject();
	}
	
	public boolean isTokenExp(String token) {
		Date expDate=getExpDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));
	}
	
	public boolean validateToken(String token,String email) {
		String tokenEmail = getEmail(token);
		return (email.equals(tokenEmail) && !isTokenExp(token));
	}
	
	

}