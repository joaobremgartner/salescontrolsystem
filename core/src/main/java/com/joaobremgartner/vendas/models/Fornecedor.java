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
 * Classe modelo para representar o objeto {@code Fornecedor}.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 *
 * @see
 * 		TPPessoa
 * @see
 * 		Endereco
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
@Entity
@Table(name="fornecedor")
public class Fornecedor implements Serializable{

	private static final long serialVersionUID = -4966492484551296585L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nm_fornecedor", length=100, nullable=false)
	private String nmFornecedor;
	
	@Basic(optional=false)
	@Column(name="tp_pessoa", nullable=false)
	@Enumerated(EnumType.STRING)
	private TPPessoa tipo;
	
	@Basic(optional=false)
	@Column(name="cpf_cnpj", nullable=false, length=20, unique=true)
	private String cpfCnpj;
	
	@Basic(optional=true)
	@Column(name="rg_fornecedor", nullable=true, length=25)
	private String rg;
	
	@Basic(optional=true)
	@Column(name= "nm_razaoSocial", length=50, unique=false)
	private String nmRazaoSocial;
	
	@Basic(optional=true)
	@OneToOne
	@Column(name="contato_fornecedor", nullable=true)
	@JoinColumn(name="id_fornecedor")
	private Contato contato;
	
	@Basic(optional=true)
	@Column(name="obs_fornecedor", length=255, nullable=true)
	private String observacoes;
	
	@OneToMany
	@Basic(optional=true)
	@Column(name="endereco", nullable=true)
	@JoinColumn(name="id_fornecedor")
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
	
	public void setId(Long id) {
		this.id = id;
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
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Fornecedor cadastrado: "+ id+", "+nmFornecedor;
	}
}
