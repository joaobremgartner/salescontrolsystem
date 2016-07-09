package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.joaobremgartner.vendas.enums.CategoriaProduto;

public class Produto implements Serializable{

	private static final long serialVersionUID = -6366081186572236465L;
	
	private Long id;
	
	private String nmProduto;
	private String codProduto;
	private CategoriaProduto categoria;
	private BigDecimal vlrVenda;
	private BigDecimal vlrCusto;
	private Integer minEstoque;
	private Integer maxEstoque;
	private Integer estoque;
	private List<Fornecedor> fornecedores;
	
	public Produto() {
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getVlrVenda() {
		return vlrVenda;
	}

	public void setVlrVenda(BigDecimal vlrVenda) {
		this.vlrVenda = vlrVenda;
	}

	public BigDecimal getVlrCusto() {
		return vlrCusto;
	}

	public void setVlrCusto(BigDecimal vlrCusto) {
		this.vlrCusto = vlrCusto;
	}

	public Integer getMinEstoque() {
		return minEstoque;
	}

	public void setMinEstoque(Integer minEstoque) {
		this.minEstoque = minEstoque;
	}

	public Integer getMaxEstoque() {
		return maxEstoque;
	}

	public void setMaxEstoque(Integer maxEstoque) {
		this.maxEstoque = maxEstoque;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Long getId() {
		return id;
	}
	
}
