package com.joaobremgartner.vendas.desconto;

import com.joaobremgartner.vendas.composicao.Desconto;
import com.joaobremgartner.vendas.excecoes.ArgumentoNuloException;
import com.joaobremgartner.vendas.models.Orcamento;

/**
 * <p>
 * Classe responsável por implementar a lógica descontos implementando a {@code interface} 
 * {@link Desconto}. 
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 * 
 * @see
 * 		Desconto
 * @see
 * 		Orcamento
 * 
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 *
 */
public class SemDesconto implements Desconto{

	/**
	 * <p>
	 * Método provido pela {@code interface} {@link Desconto} para realizar a lógica do 
	 * primeiro desconto. Caso o valor do {@code Orçamento} for menor que 300 reais 
	 * não realiza o desconto em cima do valor total.
	 * </p>
	 * 
	 * @param
	 * 		orcamento - Pega o valor total do {@link Orcamento}
	 * @return
	 * 		Valor do {@code desconto} ou o próximo {@link Desconto} passando o {@code orçamento} 
	 * 		como parâmetro.
	 */
	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento == null) {
			throw new ArgumentoNuloException("Problema no cálculo de desconto: Orçamento não pode ser nulo!");
		}
		return 0;
	}

	/**
	 * <p>
	 * Apenas atribui a variável {@code proximo} ao próximo {@link Desconto} a ser chamado.
	 * </p>
	 * 
	 * @param
	 * 		proximoDesconto - {@link Desconto}
	 */
	@Override
	public void setProximo(Desconto proximoDesconto) {
		// Não leva desconto...
	}

}
