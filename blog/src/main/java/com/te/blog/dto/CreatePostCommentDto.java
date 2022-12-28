package com.te.blog.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class CreatePostCommentDto {
	private Integer id;
	private String title;
	private String  published;
	private Date createdAt;
	private Date publishedAt;
	private String content;
}
