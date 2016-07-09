package com.joaobremgartner.vendas.models;

import java.io.Serializable;

public class Vendedor implements Serializable{

	private static final long serialVersionUID = 7948606464098914282L;

	private Long id;
	
	private String nmVendedor;
	private String email;
	
	public Vendedor() {
	}

	public String getNmVendedor() {
		return nmVendedor;
	}

	public void setNmVendedor(String nmVendedor) {
		this.nmVendedor = nmVendedor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	
}
