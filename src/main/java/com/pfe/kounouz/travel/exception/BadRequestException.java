package com.pfe.kounouz.travel.exception;

import org.springframework.http.HttpStatus;

/** 
 * Exception to throw when a bad request occurs
 * @author zda
 *
 */
public class BadRequestException extends RestException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4701887982063116637L;

	/**
	 * @param code
	 */
	public BadRequestException(String code) {
		super(code, HttpStatus.BAD_REQUEST);
	}

}
