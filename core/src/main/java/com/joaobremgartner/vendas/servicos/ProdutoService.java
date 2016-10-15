package com.joaobremgartner.vendas.servicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.joaobremgartner.vendas.composicao.DAO;
import com.joaobremgartner.vendas.excecoes.ArgumentoNuloException;
import com.joaobremgartner.vendas.models.Produto;

public class ProdutoService implements DAO<Produto>{

	private List<Produto> produtos;
	
	// Utilizado somente para facilitar a contagem de produtos
	// de outra maneira. Pode ser utilizado o list.size();
	private int totalDeProdutos = 0;
	
	public ProdutoService() {
		this.produtos = new ArrayList<Produto>();
	}
	
	@Override
	public void adiciona(Produto object) {
		this.produtos.add(object);
		this.totalDeProdutos++;
	}

	@Override
	public void adicionaNoId(Long id, Produto object) {
		if (id == null) {
			throw new ArgumentoNuloException("Id não pode ser nulo. Insira um id de produto");
		}else {
			int idInteiro = id.intValue();
			this.produtos.add(idInteiro, object);
			this.totalDeProdutos++;
		}
	}

	@Override
	public Produto buscaPorId(Long id) {
		int idInteiro = id.intValue();
		return this.produtos.get(idInteiro);
	}

	@Override
	public void remove(Long id) {
		int idInteiro = id.intValue();
		this.produtos.remove(idInteiro);
	}

	@Override
	public boolean existe(Produto object) {
		for (int i = 0; i < this.produtos.size(); i++) {
			if (object.equals(this.produtos.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int quantidadeExistente() {
		return this.totalDeProdutos;
	}
	
	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(this.produtos);
	}

}
