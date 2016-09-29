package com.joaobremgartner.vendas.enums;

import com.joaobremgartner.vendas.models.Cliente;

/**
 * <p>
 * Enum responsável por gerar os tipos de pessoa ({@code Jurídica} ou {@code Física}) e representa-los 
 * no módulo {@code web}.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Cliente
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
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
