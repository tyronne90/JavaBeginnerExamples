package com.java.beginner.exceptions;

@SuppressWarnings("serial")
public class InvalidNumberException extends Exception{

	public InvalidNumberException(String s) {
		super(s);
	}

	public InvalidNumberException() {
		super();
	}


}
