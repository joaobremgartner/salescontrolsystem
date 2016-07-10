package com.joaobremgartner.vendas.models.builders;

import java.util.ArrayList;
import java.util.List;

import com.joaobremgartner.vendas.enums.TPPessoa;
import com.joaobremgartner.vendas.models.Endereco;
import com.joaobremgartner.vendas.models.Fornecedor;

public class CriadorDeFornecedor {

	private List<Fornecedor> fornecedores = new ArrayList<>();
	
	public CriadorDeFornecedor(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
	}
	
	public static CriadorDeFornecedor novoFornecedorPJ(Long id, String nome, String cnpj, String razaoSocial) {
		Fornecedor fornecedor = criandoNovoFornecedorPJ(id, nome, cnpj, razaoSocial);
		
		return new CriadorDeFornecedor(fornecedor);
	}
	
	public static CriadorDeFornecedor novoFornecedorPF(Long id, String nome, String cpf, String rg) {
		Fornecedor fornecedor = criandoNovoFornecedorPF(id, nome, cpf, rg);
		
		return new CriadorDeFornecedor(fornecedor);
	}

	private static Fornecedor criandoNovoFornecedorPF(Long id, String nome, String cpf, String rg) {
		Fornecedor fornecedor = new Fornecedor();
		Endereco endereco = new Endereco();
		ArrayList<Endereco> enderecos = new ArrayList<>();
		
		endereco.setLogradouro("Rua B");
		endereco.setBairro("Centro");
		endereco.setCep("01512-000");
		endereco.setCidade("São Paulo");
		endereco.setNumero(222);
		
		enderecos.add(endereco);
		
		fornecedor.setId(id);
		fornecedor.setNmFornecedor(nome);
		fornecedor.setCpfCnpj(cpf);
		fornecedor.setNmRazaoSocial(rg);
		fornecedor.setTipo(TPPessoa.FISICA);
		fornecedor.setEnderecos(enderecos);
		
		return fornecedor;
	}

	private static Fornecedor criandoNovoFornecedorPJ(Long id, String nome, String cnpj, String razaoSocial) {
		Fornecedor fornecedor = new Fornecedor();
		Endereco endereco = new Endereco();
		ArrayList<Endereco> enderecos = new ArrayList<>();
		
		endereco.setLogradouro("Rua A");
		endereco.setBairro("Centro");
		endereco.setCep("01512-000");
		endereco.setCidade("São Paulo");
		endereco.setNumero(223);
		
		enderecos.add(endereco);
		
		fornecedor.setId(id);
		fornecedor.setNmFornecedor(nome);
		fornecedor.setCpfCnpj(cnpj);
		fornecedor.setNmRazaoSocial(razaoSocial);
		fornecedor.setTipo(TPPessoa.JURIDICA);
		fornecedor.setEnderecos(enderecos);
		
		return fornecedor;
	}
	
	public CriadorDeFornecedor maisFornecedorPF(int qtd) {
		Fornecedor fornecedorBase = this.fornecedores.get(0);
		for (int i = 0; i < qtd; i++) {
			this.fornecedores.add(criandoNovoFornecedorPF(fornecedorBase.getId() + qtd, fornecedorBase.getNmFornecedor(), fornecedorBase.getCpfCnpj(), 
					fornecedorBase.getRg()));
		}
		return this;
	}
	
	public CriadorDeFornecedor maisFornecedorPJ(int qtd) {
		Fornecedor fornecedorBase = this.fornecedores.get(0);
		for (int i = 0; i < qtd; i++) {
			this.fornecedores.add(criandoNovoFornecedorPJ(fornecedorBase.getId() + qtd, fornecedorBase.getNmFornecedor(), fornecedorBase.getCpfCnpj(), 
					fornecedorBase.getNmRazaoSocial()));
		}
		return this;
	}
	
	public Fornecedor criar() {
		return this.fornecedores.get(0);
	}
	
	public List<Fornecedor> criarTodos() {
		return this.fornecedores;
	}
}
