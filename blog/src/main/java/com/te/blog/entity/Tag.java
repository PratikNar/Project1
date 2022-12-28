package com.te.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Tag {

	@Id
	private Integer id;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private String content;
	
	
}
