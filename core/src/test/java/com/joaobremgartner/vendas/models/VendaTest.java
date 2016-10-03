package com.joaobremgartner.vendas.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

import com.joaobremgartner.vendas.enums.CondicaoPagamento;
import com.joaobremgartner.vendas.enums.TPPessoa;
import com.joaobremgartner.vendas.models.builders.CriadorDeCliente;
import com.joaobremgartner.vendas.models.builders.CriadorDeProduto;
import com.joaobremgartner.vendas.models.builders.CriadorDeVenda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VendaTest {

	private Venda venda;
	private Produto produto;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	private LocalDate dataVenda;
	
	@Before
	public void init() {
		// Simulando um produto
		this.produto = CriadorDeProduto.novoProduto(1L, "Base MK", new BigDecimal(50.0), new BigDecimal(20.0), 10)
				.criar();
		this.produtos.add(produto);
		// Simulando um cliente (Pessoa Física)
		this.cliente = CriadorDeCliente.novoCliente("João Faro", TPPessoa.FISICA).criar();
		// Simulando uma venda
		this.dataVenda = new LocalDate(2016, 12, 24);
		Vendedor vendedor = new Vendedor("Cecília Cabral", "cissacabral@gmail.com");
		this.venda = CriadorDeVenda.novaVenda(cliente, dataVenda, produtos, CondicaoPagamento.CREDITO, 
				new BigDecimal(50.0), new BigDecimal(0.0), vendedor)
				.criar();
		// Saída no console
		System.out.println(venda);
	}
	
	@Test
	public void deveRegistrarUmaVenda() {
		String produtoVendido = "Base MK";
		BigDecimal vlrVenda = new BigDecimal(50.0);
		String comprador = "João Faro";
		// Verificando se foi correto a condição
		TPPessoa tipo = TPPessoa.JURIDICA;
		String cpfDoComprador = "775.961.882-49";
		// Verificando se foi correto a condição - FIM
		String vendedorRegistrado = "Cecília Cabral";
		String loginDoVendedor = "cissacabral@gmail.com";
		
		assertEquals(produtoVendido, this.venda.getProdutos().iterator().next().getNmProduto());
		assertEquals(vlrVenda, this.venda.getProdutos().iterator().next().getVlrVenda());
		assertEquals(comprador, this.venda.getCliente().getNmCliente());
		
		assertNotEquals(tipo, this.venda.getCliente().getTipo());
		
		assertEquals(cpfDoComprador, this.venda.getCliente().getCpfCnpj());
		assertEquals(vendedorRegistrado, this.venda.getResponsavel().getNmVendedor());
		assertEquals(loginDoVendedor, this.venda.getResponsavel().getEmail());
	}
}
