package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.joda.time.LocalDate;

import com.joaobremgartner.vendas.enums.CondicaoPagamento;

/**
 * <p>
 * Classe modelo para representar o objeto {@code Venda}.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 *
 * @see
		Vendedor
 * @see
 * 		Produto
 * @see
 * 		Cliente
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
@Entity
@Table(name="vendas")
public class Venda implements Serializable {

	private static final long serialVersionUID = 8663138252677851271L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nu_controle", nullable=false, unique=true, length=10)
	private Integer nuControle;
	
	@Basic(optional=false)
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	private LocalDate dtVenda;
	
	@Basic(optional=true)
	@Column(name="produto", nullable=true)
	@OneToMany
	@JoinColumn(name="id_venda")
	private List<Produto> produtos;
	
	@Basic(optional=true)
	@Column(name="obs_vendas", nullable=true, length=255)
	private String observacoes;
	
	@Basic(optional=false)
	@Column(name="tp_pagamento", nullable=false)
	@Enumerated(EnumType.STRING)
	private CondicaoPagamento condicaoPgto;
	
	@Basic(optional=false)
	@Column(name="vlr_total", scale=2, nullable=false)
	private BigDecimal vlrTotal;
	
	@Basic(optional=true)
	@Column(name="vlr_desconto", scale=2, nullable=true)
	private BigDecimal vlrDesconto;
	
	@ManyToOne
	@Basic(optional=false)
	@JoinColumn(name="id_vendedor")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda registrada: " + id + ", " + nuControle + ", " + responsavel.toString() + " - " + "Produto: "
				+ produtos.toString();
	}

}
