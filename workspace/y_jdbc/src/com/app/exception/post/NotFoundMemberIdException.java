package com.app.exception.post;

public class NotFoundMemberIdException extends RuntimeException{
	public NotFoundMemberIdException() {;}
	
	public NotFoundMemberIdException(String message) {
		super(message);
	}
	
}
