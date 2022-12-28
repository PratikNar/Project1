package com.te.blog.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Category {

	@Id
	private Integer id;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private String content;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentId", referencedColumnName = "id")
	private List<Category> categories;
}
