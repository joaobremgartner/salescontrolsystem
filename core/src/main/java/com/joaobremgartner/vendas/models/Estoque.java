package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Classe responsável por representar o objeto {@code Estoque}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Produto
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
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
