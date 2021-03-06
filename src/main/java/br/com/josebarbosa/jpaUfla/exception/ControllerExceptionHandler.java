package br.com.josebarbosa.jpaUfla.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request){
		StandardError error = StandardError.builder()
				.statusCode(HttpStatus.NOT_FOUND.value())
				.msg(exception.getMessage())
				.timeStamp(System.currentTimeMillis())
				.build(); 
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
