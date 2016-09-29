package com.joaobremgartner.vendas.enums;

import com.joaobremgartner.vendas.models.Produto;

/**
 * <p>
 * Enum responsável por gerar e representar as categorias de {@code produtos} ({@link Produto}).
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Produto
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
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
