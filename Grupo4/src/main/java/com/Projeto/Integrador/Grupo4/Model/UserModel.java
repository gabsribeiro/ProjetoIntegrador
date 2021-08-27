package com.Projeto.Integrador.Grupo4.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "user")
public class UserModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdClient;
	@NotBlank(message = "Informe o Nome")
	private String name;
	@NotBlank(message = "Informe o Email")
	@Email
	private String email;
	@NotBlank(message = "Informe o Cpf")
	@CPF
	@Size(min = 11)
	private String cpf;
	@NotBlank(message = "Informe o Telefone")
	private String phone;
	@NotBlank(message = "Informe a senha")
	private String password;
	@NotBlank(message = "Informe o CEP")
	private String cep;
	@NotBlank(message = "Informe o Endereço")
	private String address;
	@NotBlank(message = "Informe o Numero")
	private String number;
	@NotBlank(message = "Informe o Complemento")
	private String complement;
	@NotBlank(message = "Informe o Bairro")
	private String district;
	@NotBlank(message = "Informe o Cidade")
	private String city;
	@NotBlank(message = "Informe o Estado")
	private String state;
	@NotBlank(message = "Informe o Tipo de Usuario")
	private String type_user; //Grande candidato a virar um ENUM
	
	//Contrutor da Classe
	public UserModel() {
		super();
	}

	//Metodos GET e SET
	public int getIdClient() {
		return IdClient;
	}

	public void setIdClient(int idClient) {
		IdClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}	
	
}
