package com.te.blog.service.adminservice;

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

@Service
public interface AdminServiceInterface {

	

	User register(RegisterDto registerDto);

	Post create(CreateBlogDto createBlogDto);

	Post updateBlog(UpdateBlogDto updateBlogDto);

	boolean delete(DeleteBlogDto deleteDto);

	PostComment createPostComment(CreatePostCommentDto createPostCommentDto);

	boolean deletePostComment(DeletePostCommentDto deletePostCommentDto);

	Tag newTag(CreateNewTagDto createNewTagDto);

	Tag updateTag(EditTagDto editTagDto);

	Tag deletetag(DeleteTagDto deleteTagDto);

}
