package com.cg.ecom.exceptions;

public class ItemNotAvailableException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ItemNotAvailableException() {
		super();

	}

	public ItemNotAvailableException(String message) {
		super(message);

	}

}
