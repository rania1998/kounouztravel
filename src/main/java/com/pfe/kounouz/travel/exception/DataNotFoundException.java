package com.pfe.kounouz.travel.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception to throw when data requested is not found
 * @author zda
 *
 */
public class DataNotFoundException extends RestException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3470557818776201155L;

	/**
	 * @param code
	 */
	public DataNotFoundException(String code) {
		super(code, HttpStatus.NOT_FOUND);
	}

}
