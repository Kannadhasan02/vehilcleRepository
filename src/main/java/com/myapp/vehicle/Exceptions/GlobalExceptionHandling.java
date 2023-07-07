package com.myapp.vehicle.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(value = NameNotFoundException.class)
	public ResponseEntity<Object> nameNotFoundExceptionHandling(NameNotFoundException n) {
		return new ResponseEntity<>(n.getMessage(), HttpStatus.NOT_FOUND);
	}

}
