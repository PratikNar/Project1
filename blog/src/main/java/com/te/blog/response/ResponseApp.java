package com.te.blog.response;



import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResponseApp {

	private boolean error;
	private int Status;
	private String msg;
	private Object data;

}
