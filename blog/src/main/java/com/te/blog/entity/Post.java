package com.te.blog.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class Post {

	@Id
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentId", referencedColumnName = "id")
	private List<Post> posts;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "postId", referencedColumnName = "id")
	private List<PostComment> postComments;

	@ManyToMany
	private Set<Tag> tags;
	
	@ManyToMany	
	private List<Category>categeries;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "postId", referencedColumnName = "id")
	private List<PostMeta> postMetas;
	
	
	
	
}
