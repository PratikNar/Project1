package com.te.blog.dto;

import org.springframework.context.annotation.ComponentScan;

import lombok.Data;

@Data
@ComponentScan
public class CreateNewTagDto {
	private Integer id;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private String content;
}
