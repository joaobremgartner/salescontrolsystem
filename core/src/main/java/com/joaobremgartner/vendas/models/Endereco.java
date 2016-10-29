package com.joaobremgartner.vendas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * Classe modelo resposável por tratar o objeto {@code Endereco}
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Cliente
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
@Entity
@Table(name="endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 7461248279471245975L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="logradouro", length=60)
	private String logradouro;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="cep", length=9)
	private String cep;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;

	public Endereco() {
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}
	
}
