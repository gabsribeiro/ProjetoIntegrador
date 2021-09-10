package com.Projeto.Integrador.Grupo4.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_category")
public class CategoryModel {
//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategory;

	@NotBlank(message = "Informe o Gênero")
	private String genre;

	@NotBlank(message = "Informe a Categoria")
	private String publisher;

	@NotBlank(message = "Informe o Formato")
	private String format;

	@NotNull(message = "Informe a Classificação")
	private int classification;
	
	@OneToMany (mappedBy = "category", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ({"category"})
	private List<BookModel> book = new ArrayList<>();

//comments	
	public CategoryModel( String genre, String publisher, String format, int classification) {
		super();
		this.genre = genre;
		this.publisher = publisher;
		this.format = format;
		this.classification = classification;
	}

	public CategoryModel() {
		super();
	}

	public long getIdCategory() {
		return idCategory;
	}
	
	
	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public List<BookModel> getBook() {
		return book;
	}

	public void setBook(List<BookModel> book) {
		this.book = book;
	}
	
	
}