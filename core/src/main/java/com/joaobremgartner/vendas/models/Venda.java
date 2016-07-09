package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.joaobremgartner.vendas.enums.CondicaoPagamento;

public class Venda implements Serializable{

	private static final long serialVersionUID = 8663138252677851271L;

	private Long id;
	
	private Integer nuControle;
	private Cliente cliente;
	private LocalDate dtVenda;
	private List<Produto> produtos;
	private String observacoes;
	private CondicaoPagamento condicaoPgto;
	private BigDecimal vlrTotal;
	private BigDecimal vlrDesconto;
	private Vendedor responsavel;
	
	public Venda() {
	}

	public Integer getNuControle() {
		return nuControle;
	}

	public void setNuControle(Integer nuControle) {
		this.nuControle = nuControle;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(LocalDate dtVenda) {
		this.dtVenda = dtVenda;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public CondicaoPagamento getCondicaoPgto() {
		return condicaoPgto;
	}

	public void setCondicaoPgto(CondicaoPagamento condicaoPgto) {
		this.condicaoPgto = condicaoPgto;
	}

	public BigDecimal getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public BigDecimal getVlrDesconto() {
		return vlrDesconto;
	}

	public void setVlrDesconto(BigDecimal vlrDesconto) {
		this.vlrDesconto = vlrDesconto;
	}

	public Vendedor getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Vendedor responsavel) {
		this.responsavel = responsavel;
	}

	public Long getId() {
		return id;
	}
	
}