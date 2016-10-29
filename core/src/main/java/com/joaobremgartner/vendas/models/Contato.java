package com.joaobremgartner.vendas.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <p>
 * Classe modelo para representar o objeto {@code Contato}.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 *
 * @see
 * 		Telefone
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
@Entity
@Table(name="contato")
public class Contato implements Serializable{

	private static final long serialVersionUID = 4982233555324571847L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nm_contato", length=100, nullable=false)
	private String nmContato;
	
	@Basic(optional=false)
	@Column(name="email_contato", length=100, nullable=false, unique=true)
	private String email;
	
	@Basic(optional=false)
	@OneToMany
	@JoinColumn(name="id_contato")
	private List<Telefone> telefones;
	
	@Basic(optional=true)
	@Column(name="cargo_contato", length=30, nullable=true)
	private String cargo;

	public Contato() {
	}

	public String getNmContato() {
		return nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}
	
	
}
