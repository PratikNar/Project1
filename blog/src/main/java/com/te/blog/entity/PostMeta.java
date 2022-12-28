package com.te.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class PostMeta {

	@Id  
	private Integer id;
	private String key;
	private String content;

	
}
