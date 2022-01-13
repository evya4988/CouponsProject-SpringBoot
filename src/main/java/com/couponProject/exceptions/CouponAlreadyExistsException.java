package com.couponProject.exceptions;

public class CouponAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public CouponAlreadyExistsException() {
//		super();
//	}

	public CouponAlreadyExistsException(String message) {
		super(message);
	}

}
