package com.joaobremgartner.vendas.models.builders;

import java.util.ArrayList;
import java.util.List;

import com.joaobremgartner.vendas.enums.TPPessoa;
import com.joaobremgartner.vendas.enums.TPTelefone;
import com.joaobremgartner.vendas.models.Cliente;
import com.joaobremgartner.vendas.models.Contato;
import com.joaobremgartner.vendas.models.Endereco;
import com.joaobremgartner.vendas.models.Telefone;

public class CriadorDeCliente {
	
	private List<Cliente> clientes = new ArrayList<>();
	
	public CriadorDeCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public static CriadorDeCliente novoCliente(String nome, TPPessoa tipo) {
		Cliente cliente = criandoNovoCliente(nome, tipo);
		
		return new CriadorDeCliente(cliente);
	}

	private static Cliente criandoNovoCliente(String nome, TPPessoa tipo) {
		List<Telefone> telefones = new ArrayList<>();
		List<Contato> contatos = new ArrayList<>();
		
		// Cadastro de telefones do cliente
		Telefone telefoneComercial = new Telefone();
		telefoneComercial.setNumero("(11)12345678");
		telefoneComercial.setTipo(TPTelefone.COMERCIAL);
		
		Telefone telefoneCelular = new Telefone();
		telefoneCelular.setNumero("(11)9999888888");
		telefoneCelular.setTipo(TPTelefone.CELULAR);
		
		telefones.add(telefoneComercial);
		telefones.add(telefoneCelular);
		// Cadastro de telefones do cliente FIM
		
		// Cadastro de contatos de clientes
		Contato contatoCliente = new Contato();
		contatoCliente.setNmContato("Maria");
		contatoCliente.setTelefones(telefones);
		contatoCliente.setEmail("maria@email.com.br");
		
		contatos.add(contatoCliente);
		// Cadastro de contatos de clientes FIM
		
		// Cadastro de endereco de clientes
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das ruas");
		endereco.setBairro("Centro");
		endereco.setCep("00000-000");
		endereco.setCidade("São Paulo");
		endereco.setNumero(123);
		// Cadastro de endereco de clientes FIM
		
		// Cadastrando clientes
		Cliente cliente = new Cliente();
		
		cliente.setNmCliente(nome);
		cliente.setTipo(tipo);
		cliente.setNmRazaoSocial("Empresa LTDA");
		
		// Cnpj ou CPF
		if (tipo.name().equals(TPPessoa.FISICA)) {
			cliente.setCpfCnpj("775.961.882-49");
		}else {
			cliente.setCpfCnpj("21.452.334/0001-57");
		}
		// Cnpj ou CPF - FIM
		
		cliente.setEmail("email@email.com.br");
		cliente.setTelefones(telefones);
		cliente.setObservacoes("Cliente teste");
		cliente.setContatos(contatos);
		cliente.setEndereco(endereco);
		
		return cliente;
	}

	public Cliente criar() {
		return this.clientes.get(0);
	}

}
