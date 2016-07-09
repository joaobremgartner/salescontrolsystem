package com.joaobremgartner.vendas.enums;

public enum CategoriaProduto {
	
	COSMETICOS("Cosméticos"),
	BIJUTERIAS("Bijuterias"),
	ROUPAS("Roupas"),
	ACESSORIOS("Acessórios"),
	OUTROS("Outros");
	
	private String descricao;

	private CategoriaProduto(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
