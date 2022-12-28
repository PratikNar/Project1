package com.te.blog.service.userservice;

import com.te.blog.dto.CreatePostCommentDto;
import com.te.blog.entity.PostComment;

public interface UserServiceInterface {

	

	PostComment usercomment(CreatePostCommentDto dto);

}
