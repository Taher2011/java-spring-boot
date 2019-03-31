package com.employee.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
