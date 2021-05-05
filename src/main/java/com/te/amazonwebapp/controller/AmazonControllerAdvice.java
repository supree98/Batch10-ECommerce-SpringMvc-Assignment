package com.te.amazonwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.te.amazonwebapp.customexception.AmazonException;

@ControllerAdvice
public class AmazonControllerAdvice {

	@ExceptionHandler(AmazonException.class)
	public String exceptionHandler(AmazonException exception, HttpServletRequest request) {
		request.setAttribute("message", exception.getMessage());
		return "header";
	}
}
