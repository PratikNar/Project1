import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



package com.te.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.blog.dto.CreatePostCommentDto;
import com.te.blog.entity.PostComment;
import com.te.blog.response.ResponseApp;
import com.te.blog.service.adminservice.AdminServiceInterface;
import com.te.blog.service.userservice.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private ResponseApp responseApp;
	@Autowired
	private UserServiceInterface userServiceInterface;
	@GetMapping("/usercomment")
	ResponseEntity<ResponseApp> usercomment(@RequestBody CreatePostCommentDto dto){
		
		PostComment postComment = userServiceInterface.usercomment(dto);
		if (postComment != null) {
			responseApp.setData(postComment);
			responseApp.setError(false);
			responseApp.setMsg("data found");
			responseApp.setStatus(200);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.ACCEPTED);
		} else {
			responseApp.setError(true);
			responseApp.setMsg("data not found");
			responseApp.setStatus(200);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
		}
	}
}
