package com.joaobremgartner.vendas.models.builders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.joaobremgartner.vendas.enums.CategoriaProduto;
import com.joaobremgartner.vendas.models.Fornecedor;
import com.joaobremgartner.vendas.models.Produto;

public class CriadorDeProduto {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public CriadorDeProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public static CriadorDeProduto novoProduto(Long id, String nome, BigDecimal valorVenda, BigDecimal valorCusto, int qtd) {
		Produto prd = criandoNovoProduto(id, nome, valorVenda, valorCusto, qtd);
		
		return new CriadorDeProduto(prd);
	}

	private static Produto criandoNovoProduto(Long id, String nome, BigDecimal valorVenda, BigDecimal valorCusto, int qtd) {
		Produto produto = new Produto();
		ArrayList<Fornecedor> fornecedores = new ArrayList<>();
		
		produto.setId(id);
		produto.setCodProduto("PRD-0012016");
		produto.setNmProduto(nome);
		produto.setVlrVenda(valorVenda);
		produto.setVlrCusto(valorCusto);
		produto.setMinEstoque(1);
		produto.setMaxEstoque(100);
		produto.setEstoque(qtd);
		// Adicionando categoria fixa de produtos (para testes)
		// Caso haja alteração no valor da categoria, terá que mudar também na classe de testes 
		produto.setCategoria(CategoriaProduto.COSMETICOS);
		
		Fornecedor fornecedor = CriadorDeFornecedor.novoFornecedorPF(1L, "João Faro", "123.456.789-00", "1234567").criar();
		fornecedores.add(fornecedor);
		
		produto.setFornecedores(fornecedores);
		
		return produto;
	}
	
	public CriadorDeProduto mais(int qtd) {
		Produto prdBase = this.produtos.get(0);
		for (int i = 0; i < qtd; i++) {
			this.produtos.add(criandoNovoProduto(prdBase.getId() + i, prdBase.getNmProduto(), prdBase.getVlrVenda(), prdBase.getVlrCusto(), 
					prdBase.getMaxEstoque() + i));
		}
		return this;
	}
	
	public Produto criar() {
		return this.produtos.get(0);
	}
	
	public List<Produto> criarTodos() {
		return this.produtos;
	}
}
