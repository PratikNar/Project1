package com.te.blog.entity;

import java.util.Date;




import javax.persistence.Entity;
import javax.persistence.Id;




import lombok.Data;
@Entity
@Data
public class PostComment {

	@Id
	private Integer id;
	private String title;
	private String  published;
	private Date createdAt;
	private Date publishedAt;
	private String content;
	
	
}
