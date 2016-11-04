package com.joaobremgartner.vendas.models;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.joaobremgartner.vendas.enums.TPPessoa;

/**
 * <p>
 * Classe modelo para representar o objeto {@code Cliente}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		TPPessoa
 * @see
 * 		Telefone
 * @see
 * 		Contato
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = -2857355706721017502L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nm_cliente", length=100, unique=true, nullable=false)
	private String nmCliente;
	
	@Basic(optional=false)
	@Column(name="tp_pessoa", nullable=false)
	@Enumerated(EnumType.STRING)
	private TPPessoa tipo;
	
	@Basic(optional=false)
	@Column(name="cpf_cnpj", length=20, unique=true, nullable=false)
	private String cpfCnpj;
	
	@Basic(optional=true)
	@Column(name= "nm_razaoSocial", length=50, unique=false)
	private String nmRazaoSocial;
	
	@Basic(optional=true)
	@Column(name="email", length=100, unique=true, nullable=true)
	private String email;
	
	@Basic(optional=true)
	@OneToMany
	@JoinColumn(name="id_cliente")
	private List<Telefone> telefones;
	
	@Basic(optional=true)
	@Column(name="observacoes", length=255, unique=false, nullable=true)
	private String observacoes;
	
	@Basic(optional=true)
	@OneToMany
	@JoinColumn(name="id_cliente")
	private List<Contato> contatos;
	
	@Basic(optional=true)
	@OneToOne
	@JoinColumn(name="id_end")
	private Endereco endereco;
	
	@Basic(optional=true)
	@Column(name="venda", nullable=true)
	@OneToMany(mappedBy="cliente")
	@JoinColumn(name="id_cliente")
	private List<Venda> vendas;
	
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

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nmCliente;
	}
}
