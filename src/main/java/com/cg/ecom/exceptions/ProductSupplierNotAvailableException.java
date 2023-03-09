package com.cg.ecom.exceptions;

public class ProductSupplierNotAvailableException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ProductSupplierNotAvailableException() {
		super();

	}

	public ProductSupplierNotAvailableException(String message) {
		super(message);

	}

}
