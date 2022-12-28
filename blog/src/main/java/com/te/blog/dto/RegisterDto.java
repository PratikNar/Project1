package com.te.blog.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class RegisterDto {

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private long mobile;
	private String email;
	private String passwordHash;
	private Date registeredAt;
	private Date lastLogin;
	private String intro;
	private String profile;
}
