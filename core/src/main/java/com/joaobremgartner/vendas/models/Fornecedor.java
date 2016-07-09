package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

import com.joaobremgartner.vendas.enums.TPPessoa;

public class Fornecedor implements Serializable{

	private static final long serialVersionUID = -4966492484551296585L;
	
	private Long id;
	
	private String nmFornecedor;
	private TPPessoa tipo;
	private String cpfCnpj;
	private String rg;
	private String nmRazaoSocial;
	private Contato contato;
	private String observacoes;
	private List<Endereco> enderecos;

	public Fornecedor() {
	}

	public String getNmFornecedor() {
		return nmFornecedor;
	}

	public void setNmFornecedor(String nmFornecedor) {
		this.nmFornecedor = nmFornecedor;
	}

	public TPPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TPPessoa tipo) {
		this.tipo = tipo;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Long getId() {
		return id;
	}
	
}
