package com.joaobremgartner.vendas.composicao;

import com.joaobremgartner.vendas.calculos.CalculadoraDeDescontos;
import com.joaobremgartner.vendas.desconto.PrimeiroDesconto;
import com.joaobremgartner.vendas.desconto.SemDesconto;
import com.joaobremgartner.vendas.models.Orcamento;

/**
 * <p>
 * Interface responsável por compor os diversos descontos do sistema de orçamentos.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		PrimeiroDesconto
 * @see
 * 		SemDesconto
 * @see
 * 		CalculadoraDeDescontos
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximoDesconto);
}
