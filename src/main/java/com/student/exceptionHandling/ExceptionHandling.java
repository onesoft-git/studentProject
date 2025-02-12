package com.student.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.customException.AgeException;

@RestControllerAdvice
public class ExceptionHandling {
	@ExceptionHandler (AgeException.class)
	public ResponseEntity<String> ageExc(AgeException ae)
	{
		return new ResponseEntity<>("Please Enter a Valid Age",HttpStatus.BAD_REQUEST);
	}

}
