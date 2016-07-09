package com.joaobremgartner.vendas.enums;

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
