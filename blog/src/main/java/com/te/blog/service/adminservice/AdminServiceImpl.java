package com.te.blog.service.adminservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


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
import com.te.blog.exception.InvalidUserException;
import com.te.blog.repository.AdminRepository;
import com.te.blog.repository.PostCommentRepository;
import com.te.blog.repository.PostRepository;
import com.te.blog.repository.TagRepository;







@Service
public class AdminServiceImpl implements AdminServiceInterface{

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private PostCommentRepository postCommentRepository;
	@Autowired
	private TagRepository tagRepository;
	
	
	@Override
	public User register(RegisterDto registerDto) {
		User user = new User();
		BeanUtils.copyProperties(registerDto, user);	
		return adminRepository.save(user);
}

	@Override
	public Post create(CreateBlogDto createBlogDto) {
		Post post = new Post();
		BeanUtils.copyProperties(createBlogDto, post);	
		return postRepository.save(post);
	}

	@Override
	public Post updateBlog(UpdateBlogDto updateBlogDto) {
		Post post = postRepository.findById(updateBlogDto.getId()).orElse(null);
		if (post != null) {
			BeanUtils.copyProperties(updateBlogDto, post);
			return postRepository.save(post);
	}else {
		throw new InvalidUserException("Invalid Input");
	}
}

	@Override
	public boolean delete(DeleteBlogDto deleteDto) {
		Post post = postRepository.findById(deleteDto.getId()).orElse(null);
		if (post != null) {
			postRepository.deleteById(post.getId());
			return true;
		} else {

			throw new InvalidUserException("Inavalid id");
		}
	}

	@Override
	public PostComment createPostComment(CreatePostCommentDto createPostCommentDto) {
		PostComment postComment = new PostComment();
		BeanUtils.copyProperties(createPostCommentDto, postComment);
		
	
		return postCommentRepository.save(postComment);
	}

	@Override
	public boolean deletePostComment(DeletePostCommentDto deletePostCommentDto) {
		PostComment postComment = postCommentRepository.findById(deletePostCommentDto.getId()).orElse(null);
		if (postComment != null) {
			postRepository.deleteById(postComment.getId());
			return true;
		} else {

			throw new InvalidUserException("Inavalid id");
		}
	}

	@Override
	public Tag newTag(CreateNewTagDto createNewTagDto) {
		Tag tag = new Tag();
		BeanUtils.copyProperties(createNewTagDto, tag);
		
	
		return tagRepository.save(tag);
	}

	@Override
	public Tag updateTag(EditTagDto editTagDto) {
		Tag tag = tagRepository.findById(editTagDto.getId()).orElse(null);
		if (tag != null) {
			BeanUtils.copyProperties(editTagDto, tag);
			return tagRepository.save(tag);
	}else {
		throw new InvalidUserException("Invalid Input");
	}
	}

	@Override
	public Tag deletetag(DeleteTagDto deleteTagDto) {
		Tag tag = tagRepository.findById(deleteTagDto.getId()).orElse(null);
		if (tag != null) {
			BeanUtils.copyProperties(deleteTagDto, tag);
			return tagRepository.save(tag);
	}else {
		throw new InvalidUserException("Invalid Input");
	}
	}
	
	
	
}












