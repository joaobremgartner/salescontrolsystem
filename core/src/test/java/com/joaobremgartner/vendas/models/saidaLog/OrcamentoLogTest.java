package com.joaobremgartner.vendas.models.saidaLog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.joaobremgartner.vendas.enums.TPPessoa;
import com.joaobremgartner.vendas.models.Cliente;
import com.joaobremgartner.vendas.models.Orcamento;
import com.joaobremgartner.vendas.models.Produto;
import com.joaobremgartner.vendas.models.builders.CriadorDeCliente;
import com.joaobremgartner.vendas.models.builders.CriadorDeProduto;

public class OrcamentoLog {

	public static void main(String[] args) {
		// Forçando produto unitário...
		Produto produto = CriadorDeProduto.novoProduto(1L, "Batom", new BigDecimal(50.0), new BigDecimal(20), 1)
				.criar();
		Cliente cliente = CriadorDeCliente.novoCliente("João Faro", TPPessoa.FISICA).criar();
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(produto);
		
		Orcamento orcamento = new Orcamento(cliente, produtos, new BigDecimal(50.0));
		
		System.out.println(orcamento);
		
		// Criando uma lista de produtos no orçamento...
		List<Produto> listaDeProdutos = CriadorDeProduto.novoProduto(2L, "Base MK", new BigDecimal(10.0), 
				new BigDecimal(5), 2)
				.mais(5)
				.criarTodos();
		// Realizando a soma dos produtos como valor total de orçamento
		BigDecimal total = BigDecimal.valueOf(0.0);
		for (Produto prd : listaDeProdutos) { 
			total = total.add(prd.getVlrVenda());
		}
		Orcamento orcamento2 = new Orcamento(cliente, listaDeProdutos, total);
		// Imprimindo resultado
		System.out.println(orcamento2);
	}
}
