package com.te.blog.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.Data;

@Entity
@Data

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Integer id;
	@Column(nullable = false )
	private String firstName;
	@Column(nullable = false )
	private String middleName;
	@Column(nullable = false )
	private String lastName;
	@Column(nullable = false )
	private long mobile;
	@Column(nullable = false )
	private String email;
	@Column(nullable = false )
	private String role;
	@Column(nullable = false )
	private String passwordHash;
	@Column(nullable = false )
	private Date registeredAt;
	@Column(nullable = false )
	private Date lastLogin;
	@Column(nullable = false )
	private String intro;
	@Column(nullable = false )
	private String profile;
	
	@OneToMany
	@JoinColumn(name="author",referencedColumnName = "id")
	private List<Post> post;

}
