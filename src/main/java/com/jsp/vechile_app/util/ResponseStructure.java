package com.jsp.vechile_app.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private int statusCode;
	private String message;
	private T data;
}
