package com.joaobremgartner.vendas.excecoes;

public class BancoDeDadosException extends RuntimeException{

	private static final long serialVersionUID = -3382260023393588197L;
	
	public BancoDeDadosException(String mensagem) {
		super(mensagem);
	}
	
	public BancoDeDadosException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
