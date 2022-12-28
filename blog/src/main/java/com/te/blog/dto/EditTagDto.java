package com.te.blog.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EditTagDto {

	private Integer id;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private String content;
}
