package com.joaobremgartner.vendas.models;

import java.io.Serializable;

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
public class Vendedor implements Serializable{

	private static final long serialVersionUID = 7948606464098914282L;

	private Long id;
	
	private String nmVendedor;
	private String email;
	
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
