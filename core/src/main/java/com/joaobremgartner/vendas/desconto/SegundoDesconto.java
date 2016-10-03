package com.joaobremgartner.vendas.desconto;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.models.Orcamento;

public class SegundoDesconto implements Desconto{
	
	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		double valoOrcamento = orcamento.getValorOrcamento().doubleValue();
		if (valoOrcamento >= 500 && valoOrcamento < 700.0) {
			return valoOrcamento * 0.20;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

	
}
