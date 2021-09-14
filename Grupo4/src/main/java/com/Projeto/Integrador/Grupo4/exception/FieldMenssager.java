package com.Projeto.Integrador.Grupo4.exception;

import java.io.Serializable;

public class FieldMenssager implements Serializable{

private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String menssage;
	
	public FieldMenssager() {}

	public FieldMenssager(String fieldName, String menssage) {
		super();
		this.fieldName = fieldName;
		this.menssage = menssage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}
}
