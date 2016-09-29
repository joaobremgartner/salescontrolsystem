package com.joaobremgartner.vendas.enums;

import com.joaobremgartner.vendas.models.Telefone;

/**
 * <p>
 * Enum responsável por gerar os tipos de telefone e representa-los no módulo {@code web}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Telefone
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
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
