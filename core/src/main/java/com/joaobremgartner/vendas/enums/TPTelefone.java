package com.joaobremgartner.vendas.enums;

public enum TPTelefone {
	
	COMERCIAL("Comercial"),
	CELULAR("Celular"),
	RESIDENCIAL("Residencial");
	
	private String tipo;

	private TPTelefone(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
