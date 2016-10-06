package com.joaobremgartner.vendas.models;

import java.math.BigDecimal;
import java.util.List;

import com.joaobremgartner.vendas.enums.CondicaoPagamento;

/**
 * <p>
 * Classe responsável por representar a entidade {@code orçamento}. 
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Cliente
 * @see
 * 		Produto
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
public class Orcamento {

	private Long id;

	private Cliente cliente;
	private List<Produto> produtos;
	private BigDecimal valorOrcamento;
	private CondicaoPagamento condicao;

	public Orcamento() {
	}

	public Orcamento(Cliente cliente, List<Produto> produtos, BigDecimal valor, CondicaoPagamento condicao) {
		this.cliente = cliente;
		this.produtos = produtos;
		this.valorOrcamento = valor;
		this.condicao = condicao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public CondicaoPagamento getCondicao() {
		return condicao;
	}

	public void setCondicao(CondicaoPagamento condicao) {
		this.condicao = condicao;
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
