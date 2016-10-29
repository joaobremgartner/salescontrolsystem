package com.joaobremgartner.vendas.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.joaobremgartner.vendas.enums.TPTelefone;

/**
 * <p>
 * Classe responsável por representar o objeto {@code Telefone}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		TPTelefone
 * @see
 * 		Contato
 * @see
 * 		Cliente
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 * 
 *
 */
@Entity
@Table(name="telefone")
public class Telefone implements Serializable {

	private static final long serialVersionUID = -4989383931401006914L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="n_telefone", nullable=true)
	private String numero;
	
	@Basic(optional=false)
	@Column(name="tp_telefone")
	@Enumerated(EnumType.STRING)
	private TPTelefone tipo;

	public Telefone() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TPTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TPTelefone tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}
	
	
}
