package com.cetpa.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cetpa.exception.DoctorNotFoundException;

@RestControllerAdvice
public class ValidationAndExceptionHandlerController extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		BindingResult res = ex.getBindingResult();
		List<ObjectError> list = res.getAllErrors();
		List<String> errorList = new ArrayList<String>();
		for(ObjectError error: list) {
			errorList.add(error.getDefaultMessage());
		}
		ExceptionMessage errors = new ExceptionMessage();
		errors.setErrorList(errorList);
		errors.setMessage("Validation failed...");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
	
	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<Object> handleDoctorNotFoundException(DoctorNotFoundException ex){
		ExceptionMessage errors = new ExceptionMessage();
		List<String> errorList = new ArrayList<String>();
		errorList.add(ex.getMessage());
		errors.setErrorList(errorList);
		errors.setMessage("Doctor Not Found Exception....");

		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex){
		ExceptionMessage errors = new ExceptionMessage();
		List<String> errorList = new ArrayList<String>();
		errorList.add(ex.getMessage());
		errors.setErrorList(errorList);
		errors.setMessage("Exception occurred");

		return  ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(errors);
	}
}
