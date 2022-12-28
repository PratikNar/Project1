package com.te.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jwtutil.JwtUtil;
import jwtutil.ResponseUser;
import jwtutil.UserReq;

@RestController
@RequestMapping("/loginn")
public class LoginController {

	@Autowired(required = false)
	private JwtUtil jwtUtil;
	@PostMapping("/ulogin")
	public ResponseEntity<ResponseUser> userLogin(@RequestBody UserReq userReq){
		String token = jwtUtil.generateToken(userReq.getEmail());
		 return  ResponseEntity.ok(new ResponseUser(token, "Token Generated"));
		
	}
}
