package com.te.blog.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class UpdateBlogDto {

private Integer id;
	
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private String published;
	private Date createdAt;
	private Date updatedAt;
	private Date publishedAt;
	private String content;
}
