package com.joaobremgartner.vendas.desconto;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.models.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		// Não leva desconto...
	}

}
