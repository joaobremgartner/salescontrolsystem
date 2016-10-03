package com.joaobremgartner.vendas.calculos;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.desconto.PrimeiroDesconto;
import com.joaobremgartner.vendas.desconto.SegundoDesconto;
import com.joaobremgartner.vendas.desconto.TerceiroDesconto;
import com.joaobremgartner.vendas.desconto.SemDesconto;
import com.joaobremgartner.vendas.models.Orcamento;

public class CalculadoraDeDescontos {
	
	public double calculaDesconto(Orcamento orcamento) {
		Desconto primeiroDesconto = new PrimeiroDesconto();
		Desconto segundoDesconto = new SegundoDesconto();
		Desconto terceiroDesconto = new TerceiroDesconto();
		Desconto semDesconto = new SemDesconto();
		
		primeiroDesconto.setProximo(segundoDesconto);
		segundoDesconto.setProximo(terceiroDesconto);
		terceiroDesconto.setProximo(semDesconto);
		
		// Retorna desconto a partir do primeiro...
		return primeiroDesconto.desconta(orcamento);
	}
}
