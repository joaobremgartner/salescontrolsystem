package com.joaobremgartner.vendas.enums;

import com.joaobremgartner.vendas.models.Produto;
import com.joaobremgartner.vendas.models.Venda;

/**
 * <p>
 * Enum responsável por gerar os tipos de pagamentos e representa-los no módulo {@code web}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Venda
 * @see
 * 		Produto
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
public enum CondicaoPagamento {

	VISTA("À vista"),
	CREDITO("Cartão de crédito"),
	CHEQUE("Cheque"),
	OUTROS("Outros");
	
	private String condicao;

	private CondicaoPagamento(String condicao) {
		this.condicao = condicao;
	}
	
	public String getCondicao() {
		return condicao;
	}
}
