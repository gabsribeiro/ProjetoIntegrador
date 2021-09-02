package com.Projeto.Integrador.Grupo4.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
public class BookModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;

	@NotBlank(message = "Informe o título")
	private String title;

	@NotBlank(message = "Insira uma descrição")
	private String description;

	@NotNull(message = "Informe o valor do livro")
	private Double price;

	@NotBlank(message = "Insira o nome do autor")
	private String author;

	@NotNull(message = "Insira o ano de publicação")
	private int year;

	@NotNull(message = "Informe a quantidade do estoque")
	private int inventory;
	
	
	@NotBlank
	private String language;
	
	@NotNull
	@Size (min = 13)
	private int ISBN;
	
	@NotNull
	@Size (min = 13)
	private int EAN;
	
	@NotBlank
	private String Country;
	
	@NotNull(message = "Informe a quantidade páginas")
	private int pages;
	

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getEAN() {
		return EAN;
	}

	public void setEAN(int eAN) {
		EAN = eAN;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
}
