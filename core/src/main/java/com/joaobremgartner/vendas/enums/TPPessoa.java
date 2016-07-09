package com.joaobremgartner.vendas.enums;

public enum TPPessoa {
	
	FISICA("Física"),
	JURIDICA("Jurídica");
	
	private String tipo;

	private TPPessoa(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
