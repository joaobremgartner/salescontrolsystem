package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

public class Estoque implements Serializable{

	private static final long serialVersionUID = -3859027583424527096L;

	private Long id;
	
	private List<Produto> produtos;

	public Estoque() {
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	
}
