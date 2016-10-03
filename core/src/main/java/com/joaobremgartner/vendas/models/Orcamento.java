package com.joaobremgartner.vendas.models;

import java.math.BigDecimal;
import java.util.List;

public class Orcamento {

	private Long id;

	private Cliente cliente;
	private List<Produto> produtos;
	private BigDecimal valorOrcamento;

	public Orcamento() {
	}

	public Orcamento(Cliente cliente, List<Produto> produtos, BigDecimal valor) {
		this.cliente = cliente;
		this.produtos = produtos;
		this.valorOrcamento = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(BigDecimal valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Orçamento nº: " + id + " com valor total de " + this.valorOrcamento + "\n" + "Cliente: "
				+ this.cliente.getNmCliente() + "\n"+ "Lista de produtos: \n"+ produtos;
	}
}
