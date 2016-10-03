package com.joaobremgartner.vendas.composicao;

import com.joaobremgartner.vendas.models.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximoDesconto);
}
