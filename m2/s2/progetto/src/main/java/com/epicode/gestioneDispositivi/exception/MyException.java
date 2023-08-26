package com.epicode.gestioneDispositivi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.epicode.gestioneDispositivi.exception.PersonalException.DispositivoNonDisponibileException;

import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class MyException extends ResponseEntityExceptionHandler{

		@ExceptionHandler(EntityNotFoundException.class)
		public ResponseEntity<String> noEntityFound(EntityNotFoundException e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		@ExceptionHandler(DispositivoNonDisponibileException.class)
		public ResponseEntity<String> entityNonDisponibile(DispositivoNonDisponibileException e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);}
	

		

}
