package com.app.exception.member;

public class DuplicateException extends RuntimeException{
	public DuplicateException() {;}
	
	public DuplicateException (String message) {
		super(message);
	}

}
