package com.joaobremgartner.vendas.models;

import java.io.Serializable;

import com.joaobremgartner.vendas.enums.TPTelefone;

public class Telefone implements Serializable {

	private static final long serialVersionUID = -4989383931401006914L;

	private Long id;
	
	private String numero;
	private TPTelefone tipo;

	public Telefone() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TPTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TPTelefone tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}
	
	
}
