package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

public class Contato implements Serializable{

	private static final long serialVersionUID = 4982233555324571847L;
	
	private Long id;
	
	private String nmContato;
	private String email;
	private List<Telefone> telefones;
	private String cargo;

	public Contato() {
	}

	public String getNmContato() {
		return nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}
	
	
}
