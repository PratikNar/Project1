//package security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import lombok.RequiredArgsConstructor;
//import security.filter.SecurityFilter;
//@RequiredArgsConstructor
//@SuppressWarnings("deprecation")
//@EnableWebSecurity
//
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//
//	
//	private final PasswordEncoder passwordEncoder;
//	private final UserDetailsService userDetailsService;
//	private final SecurityFilter securityFilter;
//	
//	private final String ADMIN = "ADMIN";
//
//	@Bean
//	@Override
//	protected AuthenticationManager authenticationManager() throws Exception {
//		
//		return super.authenticationManager();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/auth/employee/**").hasAnyRole(ADMIN);
//		
//		http.authorizeRequests().antMatchers("/public/**").permitAll().anyRequest().authenticated();
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		http.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
//	}
//	
//	
//	
//	
//	
//	
//	
//}
