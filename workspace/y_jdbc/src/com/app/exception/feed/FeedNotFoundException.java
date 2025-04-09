package com.app.exception.feed;

public class FeedNotFoundException extends RuntimeException{
	public FeedNotFoundException() {;}
	
	public FeedNotFoundException(String message) {
	      super(message);
	   }
}
