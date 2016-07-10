package com.joaobremgartner.vendas.models;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.joaobremgartner.vendas.models.builders.CriadorDeProduto;

public class ProdutoTest {

	private Produto produto;
	private List<Produto> produtos;
	
	@Before
	public void init() {
		// Criando um produto
		this.produto = CriadorDeProduto.novoProduto(1L, "Batom", new BigDecimal(40.0), new BigDecimal(20.0), 2).criar();
		// Criando uma lista de produtos
		this.produtos = CriadorDeProduto.novoProduto(1L, "Perfume", new BigDecimal(100.0), new BigDecimal(40.0), 3).mais(5).criarTodos();
	}
	
	@Test
	public void deveRetornarUmProdutoCadastrado() {
		String nomeProduto = "Batom";
		BigDecimal vlrVenda = new BigDecimal(40.0);
		BigDecimal vlrCusto = new BigDecimal(20.0);
		Long id = 1L;
		
		assertEquals(nomeProduto, this.produto.getNmProduto());
		assertEquals(vlrVenda, this.produto.getVlrVenda());
		assertEquals(vlrCusto, this.produto.getVlrCusto());
		assertEquals(id, this.produto.getId());
	}
	
	@Test
	public void deveRetornarUmaListaDeProdutos() {
		int tamanho = 6;
		Long idDoPrimeiro = 1L;
		Long idDoSegundo = new Long(2);
		
		assertEquals(tamanho, this.produtos.size());
		assertEquals(idDoPrimeiro, this.produtos.get(1).getId());
		assertEquals(idDoSegundo, this.produtos.get(2).getId());
	}
	
	@Test
	public void deveRetornarCategoriaComoDescricao() {
		String categoria = "Cosméticos";
		assertEquals(categoria, this.produto.getCategoria().getDescricao());
	}
}
