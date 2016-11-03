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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.joaobremgartner.vendas.enums.CategoriaProduto;

/**
 * <p>
 * Classe modelo para representar o objeto {@code Produto}.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 *
 * @see
 * 		CategoriaProduto
 * @see
 * 		Fornecedor
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
@Entity
@Table(name="produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = -6366081186572236465L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional=false)
	@Column(name="nm_produto", length=100, nullable=false)
	private String nmProduto;
	
	@Basic(optional=false)
	@Column(name="cd_produto", nullable=false, unique=true)
	private String codProduto;
	
	@Basic(optional=false)
	@Column(name="tp_produto", nullable=false)
	@Enumerated(EnumType.STRING)
	private CategoriaProduto categoria;
	
	@Basic(optional=false)
	@Column(name="vlr_venda", nullable=false, scale=2)
	private BigDecimal vlrVenda;
	
	@Basic(optional=false)
	@Column(name="vlr_custo", nullable=false, scale=2)
	private BigDecimal vlrCusto;
	
	@Basic(optional=false)
	@Column(name="min_estoque", nullable=false)
	private Integer minEstoque;
	
	@Basic(optional=false)
	@Column(name="max_estoque", nullable=false)
	private Integer maxEstoque;
	
	@Basic(optional=false)
	@Column(name="estoque", nullable=false)
	private Integer estoque;
	
	@Basic(optional=false)
	@OneToMany
	@JoinColumn(name="id_fornecedor")
	private List<Fornecedor> fornecedores;
	
	public Produto() {
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getVlrVenda() {
		return vlrVenda;
	}

	public void setVlrVenda(BigDecimal vlrVenda) {
		this.vlrVenda = vlrVenda;
	}

	public BigDecimal getVlrCusto() {
		return vlrCusto;
	}

	public void setVlrCusto(BigDecimal vlrCusto) {
		this.vlrCusto = vlrCusto;
	}

	public Integer getMinEstoque() {
		return minEstoque;
	}

	public void setMinEstoque(Integer minEstoque) {
		this.minEstoque = minEstoque;
	}

	public Integer getMaxEstoque() {
		return maxEstoque;
	}

	public void setMaxEstoque(Integer maxEstoque) {
		this.maxEstoque = maxEstoque;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return codProduto +" - "+ nmProduto+ "\n";
	}
}
