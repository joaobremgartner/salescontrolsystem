package com.joaobremgartner.vendas.excecoes;

public class ArgumentoNuloException extends RuntimeException {
	
	private static final long serialVersionUID = -6308352187790708246L;

	public ArgumentoNuloException(String mensagem) {
		super(mensagem);
	}
	
	public ArgumentoNuloException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
