package com.joaobremgartner.vendas.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.joaobremgartner.vendas.enums.TPPessoa;
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
		// Cadastrando novo produto
		Long id = 1L;
		String nomeProduto = "Batom";
		// Atribuindo valor de venda ao produto
		BigDecimal vlrVenda = new BigDecimal(40.0);
		// Atribuindo valor de custo ao produto
		BigDecimal vlrCusto = new BigDecimal(20.0);
		
		assertEquals(nomeProduto, this.produto.getNmProduto());
		assertEquals(vlrVenda, this.produto.getVlrVenda());
		assertEquals(vlrCusto, this.produto.getVlrCusto());
		assertEquals(id, this.produto.getId());
	}
	
	@Test
	public void deveRetornarUmaListaDeProdutos() {
		int tamanho = 6;
		// teste da primeira forma de representar um long
		Long idDoPrimeiro = 1L;
		// teste da segunda forma de representar um long
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
	
	@Test
	public void deveRetornarAqtdEmEstoque() {
		int estoqueAtual = 2;
		assertEquals(estoqueAtual, this.produto.getEstoque().intValue());
	}
	
	@Test
	public void deveRetornarCodProdutoPadrao() {
		String codigo = "PRD-0012016";
		assertEquals(codigo, this.produto.getCodProduto());
	}
	
	@Test
	public void deveRetornarInfoFornecedor() {
		int vazio = 0;
		String nmFornecedor = "João Faro";
		String cpfFornecedor = "123.456.789-00";
		Enum<TPPessoa> tpFornecedor = TPPessoa.FISICA; 
		
		assertEquals(nmFornecedor, this.produto.getFornecedores().iterator().next().getNmFornecedor());
		assertEquals(cpfFornecedor, this.produto.getFornecedores().iterator().next().getCpfCnpj());
		assertEquals(tpFornecedor, this.produto.getFornecedores().iterator().next().getTipo());
		assertNotEquals(vazio , this.produto.getFornecedores().size());
	}
}
