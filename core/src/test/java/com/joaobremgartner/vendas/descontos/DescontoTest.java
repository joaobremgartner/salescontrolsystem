package com.joaobremgartner.vendas.descontos;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.joaobremgartner.vendas.calculos.CalculadoraDeDescontos;
import com.joaobremgartner.vendas.enums.CondicaoPagamento;
import com.joaobremgartner.vendas.models.Cliente;
import com.joaobremgartner.vendas.models.Orcamento;
import com.joaobremgartner.vendas.models.Produto;
import com.joaobremgartner.vendas.models.builders.CriadorDeProduto;

public class DescontoTest {

	private CalculadoraDeDescontos calculadora;
	private Orcamento orcamento;
	private Orcamento orcamentoSemDesconto;
	
	@Before
	public void init() {
		BigDecimal total = new BigDecimal(0);
		this.calculadora = new CalculadoraDeDescontos();
				
		// cliente 
		Cliente cliente = new Cliente();
		cliente.setNmCliente("João Faro");
		cliente.setEmail("joaobremgartner@gmail.com");
		// cliente FIM
		
		// Lista de produtos que o cliente comprou
		List<Produto> produtos = CriadorDeProduto
				.novoProduto(1L, "Produto qualquer", new BigDecimal(100.0), new BigDecimal(50.0), 1)
				.mais(5)
				.criarTodos();
		// Lista de produtos FIM
		
		// Calculando valor final da futura venda
		for (Produto produto : produtos) {
			total = total.add(produto.getVlrVenda());
		}
		
		// Retornando o Orçamento final
		this.orcamento = new Orcamento(cliente, produtos, total, CondicaoPagamento.VISTA);
		this.orcamentoSemDesconto = new Orcamento(cliente, produtos, total, CondicaoPagamento.CREDITO);
	}
	
	@Test
	public void deveRetornarUmDescontoDe5PorCento() {
		/*
		 * Orçamento atual: 
		 * Cliente - João Faro
		 * Quantidade de produtos orçados - 6
		 * Total da compra - R$600,00
		 * Condição do pagamento - a vista
		 */
		double desconto = this.calculadora.calculaDesconto(this.orcamento);
		double valorDeDesconto = 30.0; // R$30,00 reais
		
		assertEquals(valorDeDesconto, desconto, 0.0001);
	}
	
	@Test
	public void deveRetornarValorTotalComDescontoDe5PorCento() {
		double desconto = this.calculadora.calculaDesconto(this.orcamento);
		double valorTotalComDesconto = this.orcamento.getValorOrcamento().doubleValue() - desconto;
		
		double valorEsperado = 570.0;
		assertEquals(valorEsperado, valorTotalComDesconto, 0.0001);
	}
	
	@Test
	public void naoDeveRetornarDescontoNoOrcamento() {
		/*
		 * Orçamento atual: 
		 * Cliente - João Faro
		 * Quantidade de produtos orçados - 6
		 * Total da compra - R$600,00
		 * Condição do pagamento - Crédito
		 */
		double desconto = this.calculadora.calculaDesconto(this.orcamentoSemDesconto);
		double valorDeDesconto = 00.0; // Sem desconto, pois a condição do pagamento será em Cartão de crédito
		
		assertEquals(valorDeDesconto, desconto, 0.0001);
	}
}
