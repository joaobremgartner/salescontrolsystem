package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <p>
 * Classe reponsável por representar o objeto {@code Vendedor}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable{

	private static final long serialVersionUID = 7948606464098914282L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nm_vendedor", nullable=false, length=100)
	private String nmVendedor;
	
	@Basic(optional=false)
	@Column(name="email_vendedor", nullable=false, length=100, unique=true)
	private String email;
	
	@Basic(optional=true)
	@OneToMany(mappedBy="responsavel")
	private List<Venda> vendas;
	
	public Vendedor(String nome, String email) {
		this.nmVendedor = nome;
		this.email = email;
	}
	public Vendedor() {
	}

	public String getNmVendedor() {
		return nmVendedor;
	}

	public void setNmVendedor(String nmVendedor) {
		this.nmVendedor = nmVendedor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Vendedor other = (Vendedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return nmVendedor;
	}
}
