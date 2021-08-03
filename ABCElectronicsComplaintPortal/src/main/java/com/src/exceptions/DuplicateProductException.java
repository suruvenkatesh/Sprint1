package com.src.exceptions;

public class DuplicateProductException extends RuntimeException{
	public DuplicateProductException(String msg) {
		super(msg);
	}
}
