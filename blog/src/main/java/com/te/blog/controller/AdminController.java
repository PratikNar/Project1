package com.te.blog.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.blog.dto.CreateBlogDto;
import com.te.blog.dto.CreateNewTagDto;
import com.te.blog.dto.CreatePostCommentDto;
import com.te.blog.dto.DeleteBlogDto;
import com.te.blog.dto.DeletePostCommentDto;
import com.te.blog.dto.DeleteTagDto;
import com.te.blog.dto.EditTagDto;
import com.te.blog.dto.RegisterDto;
import com.te.blog.dto.UpdateBlogDto;
import com.te.blog.entity.Post;
import com.te.blog.entity.PostComment;
import com.te.blog.entity.Tag;
import com.te.blog.entity.User;
import com.te.blog.response.ResponseApp;

import com.te.blog.service.adminservice.AdminServiceInterface;



 

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminServiceInterface adminServiceInterface;
	@Autowired
	private ResponseApp responseApp;
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
    @PostMapping("/register")
	private ResponseEntity<ResponseApp> register(@RequestBody RegisterDto registerDto ){
		
		User user=adminServiceInterface.register(registerDto);
		
		if (user != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(user));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
		}
		return null;
	}
    
    
    
    @PostMapping("/createpost")
    private ResponseEntity<ResponseApp> create(@RequestBody CreateBlogDto createBlogDto ){
    	Post post=adminServiceInterface.create(createBlogDto);
    	if (post != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(post));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful ");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    	
    }	
    }
	@PutMapping("/updatepost")
	private ResponseEntity<ResponseApp> updateBlog(@RequestBody UpdateBlogDto updateBlogDto){
		Post post=adminServiceInterface.updateBlog(updateBlogDto);
		if (post != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(post));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    	
    }	
		
	}
	
	@DeleteMapping("/deletepost")
	private ResponseEntity<ResponseApp> delete(@RequestBody DeleteBlogDto deleteDto) {
		if (adminServiceInterface.delete(deleteDto)) {
			responseApp.setError(false);
			responseApp.setMsg("data deleted sucessfully");
			responseApp.setStatus(200);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.ACCEPTED);
		} else {
			responseApp.setError(true);
			responseApp.setMsg("Unsuccessful ");
			responseApp.setStatus(400);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PostMapping("/createpostcomment")
	private ResponseEntity<ResponseApp> createPostComment(@RequestBody CreatePostCommentDto createPostCommentDto ){
		PostComment postComment=adminServiceInterface.createPostComment(createPostCommentDto);
		if (postComment != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(postComment));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful ");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    }    }	
		
		
	
	@DeleteMapping("/deletepostcomment")
	private ResponseEntity<ResponseApp> deletePostComment(@RequestBody DeletePostCommentDto deletePostCommentDto) {
		if (adminServiceInterface.deletePostComment(deletePostCommentDto)) {
			responseApp.setError(false);
			responseApp.setMsg("data deleted sucessfully");
			responseApp.setStatus(200);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.ACCEPTED);
		} else {
			responseApp.setError(true);
			responseApp.setMsg("Unsuccessful ");
			responseApp.setStatus(400);
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/createnewtag")
	private ResponseEntity<ResponseApp> newTag(@RequestBody CreateNewTagDto createNewTagDto ){
		Tag tag=adminServiceInterface.newTag(createNewTagDto);
		if (tag != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(tag));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful ");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    }    }	
	
	@PostMapping("/updatetag")
	private ResponseEntity<ResponseApp> updateTag(@RequestBody EditTagDto editTagDto ){
		Tag tag=adminServiceInterface.updateTag(editTagDto);
		if (tag != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(tag));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful ");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    }    }	
	
	@PostMapping("/deletetag")
	private ResponseEntity<ResponseApp> deletetag(@RequestBody DeleteTagDto deleteTagDto ){
		Tag tag=adminServiceInterface.deletetag(deleteTagDto);
		if (tag != null) {
			responseApp.setError(false);
			responseApp.setMsg("successful");
			responseApp.setStatus(200);
			responseApp.setData(Arrays.asList(tag));
			return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    } else {
    	responseApp.setError(true);
		responseApp.setMsg("Unsuccessful ");
		responseApp.setStatus(200);
		return new ResponseEntity<ResponseApp>(responseApp, HttpStatus.OK);
    }    }	




}
