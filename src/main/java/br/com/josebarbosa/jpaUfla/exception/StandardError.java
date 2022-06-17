package br.com.josebarbosa.jpaUfla.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardError implements Serializable {
	
	private Integer statusCode;
	private String msg;
	private Long timeStamp; 
	
}
