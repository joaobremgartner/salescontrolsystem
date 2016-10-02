package com.joaobremgartner.vendas.models.builders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

import com.joaobremgartner.vendas.enums.CondicaoPagamento;
import com.joaobremgartner.vendas.models.Cliente;
import com.joaobremgartner.vendas.models.Produto;
import com.joaobremgartner.vendas.models.Venda;
import com.joaobremgartner.vendas.models.Vendedor;

public class CriadorDeVenda {

	private List<Venda> vendas = new ArrayList<>();
	
	public CriadorDeVenda(Venda venda) {
		this.vendas.add(venda);
	}
	
	public static CriadorDeVenda novaVenda(Cliente cliente, LocalDate dtVenda, List<Produto> produtos, 
			CondicaoPagamento formaPagto, BigDecimal vlrVenda, BigDecimal vlrDesconto, Vendedor vendedor) {
		
		Venda venda = criandoNovaVenda(cliente, dtVenda, produtos, formaPagto, vlrVenda, vlrDesconto, 
				vendedor);
		
		return new CriadorDeVenda(venda);
	}

	private static Venda criandoNovaVenda(Cliente cliente,  LocalDate dtVenda,
			List<Produto> produtos, CondicaoPagamento formaPagto, BigDecimal vlrVenda, BigDecimal vlrDesconto,
			Vendedor vendedor) {
		
		// Cadastrando uma venda
		Venda venda = new Venda();
		
		venda.setCliente(cliente);
		venda.setNuControle(12345);
		venda.setDtVenda(new LocalDate(2016, 12, 24));
		venda.setProdutos(produtos);
		venda.setCondicaoPgto(formaPagto);
		venda.setVlrTotal(vlrVenda);
		venda.setVlrDesconto(vlrDesconto);
		venda.setResponsavel(vendedor);
		// Cadastrando uma venda - FIM
		
		return venda;
	}
	
	public Venda criar() {
		return this.vendas.get(0);
	}
}
