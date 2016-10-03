package com.joaobremgartner.vendas.desconto;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.models.Orcamento;

public class TerceiroDesconto implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		double valorOrcamento = orcamento.getValorOrcamento().doubleValue();
		if (valorOrcamento >= 700) {
			return valorOrcamento * 0.30;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

}
