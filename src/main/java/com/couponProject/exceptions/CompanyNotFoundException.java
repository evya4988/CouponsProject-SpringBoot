package com.couponProject.exceptions;


public class CompanyNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//public CompanyNotFoundException() {}

	public CompanyNotFoundException(String message) 
			{
				super(message);
			}
}