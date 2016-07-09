package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

import com.joaobremgartner.vendas.enums.TPPessoa;

public class Cliente implements Serializable{

	private static final long serialVersionUID = -2857355706721017502L;

	private Long id;
	
	private String nmCliente;
	private TPPessoa tipo;
	private String cpfCnpj;
	private String nmRazaoSocial;
	private String email;
	private List<Telefone> telefones;
	private String observacoes;
	private List<Contato> contatos;
	private Endereco endereco;
	
	public Cliente() {
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
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

	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}
	
}
