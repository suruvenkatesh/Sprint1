package com.src.advice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.src.exceptions.InValidComplaintIdException;
import com.src.exceptions.OutofWarrantyException;

@ControllerAdvice
public class ComplaintExceptionHandler {

		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<?> handleComplaintException(MethodArgumentNotValidException exception) {
			
			List<String> errorList = exception.getBindingResult()
	                .getFieldErrors()
	                .stream()
	                .map(x -> x.getDefaultMessage())
	                .collect(Collectors.toList());
			
			Map<String, Object> errorBody = new LinkedHashMap<>();

			errorBody.put("error", "Request Failed");
			errorBody.put("timestamp", LocalDateTime.now());
		    errorBody.put("details", exception.getMessage());

			return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
		}
		@ExceptionHandler(OutofWarrantyException.class)
		public ResponseEntity<?> handleComplaintException(OutofWarrantyException exception) {
			Map<String, Object> errorBody = new LinkedHashMap<>();

			errorBody.put("error", "Warranty Expired");
			errorBody.put("timestamp", LocalDateTime.now());
		    errorBody.put("details", exception.getMessage());

			return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
		}

	}
