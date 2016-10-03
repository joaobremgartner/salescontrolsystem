package com.joaobremgartner.vendas.desconto;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.models.Orcamento;

public class SegundoDesconto implements Desconto{
	
	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValorOrcamento().doubleValue() >= 500 
				&& orcamento.getValorOrcamento().doubleValue() < 700.0) {
			return orcamento.getValorOrcamento().doubleValue() * 0.20;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

	
}
