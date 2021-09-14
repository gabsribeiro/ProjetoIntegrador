package com.Projeto.Integrador.Grupo4.service.exception;

public class DataIntegratyViolationException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DataIntegratyViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntegratyViolationException(String message) {
		super(message);
	}

}
