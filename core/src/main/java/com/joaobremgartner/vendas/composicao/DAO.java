package com.joaobremgartner.vendas.composicao;

/**
 * <p>
 * Interface responsável por compor as implementações de {@code CRUD} de 
 * objetos no sistema.
 * </p>
 * 
 * @author Engº. João Paulo Bremgartner Faro - CREA: 27708D-PA
 *
 * @param <E>
 * 		Parâmetro genérico para ser implementado de acordo com o {@code object}.
 * @since
 * 		1.8
 * @version
 * 		1.0.0
 */
public interface DAO<E> {
	
	/**
	 * <p>
	 * Adiciona um {@code objeto} genérico de acordo com a implementação.
	 * </p>
	 * 
	 * @param object
	 * 		Implementado de acordo com o tipo de objeto.
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * 
	 */
	public void adiciona(E object);
	
	/**
	 * <p>
	 * Adiciona um {@code objeto} genérico de acordo com a implementação de 
	 * acordo com a posição na lista.
	 * </p>
	 * 
	 * @param object
	 * 		Implementado de acordo com o tipo de objeto.
	 * @param id
	 * 		Implementado de acordo com a posição do objeto.
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * 
	 */
	public void adicionaNoId(Long id, E object);
	
	/**
	 * <p>
	 * Busca um {@code objeto} genérico de acordo com a implementação.
	 * </p>
	 * 
	 * @param id
	 * 		Implementado de acordo com a posição do objeto.
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * @return
	 * 		id correspondente ao objeto existente.
	 * 
	 */
	public E buscaPorId(Long id);
	
	/**
	 * <p>
	 * Remove um {@code objeto} genérico de acordo com a implementação de 
	 * acordo com a posição na lista.
	 * </p>
	 * 
	 * @param id
	 * 		Implementado de acordo com a posição do objeto.
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * 
	 */
	public void remove(Long id);
	
	/**
	 * <p>
	 * Verifica se existe um {@code objeto} genérico de acordo com a implementação.
	 * </p>
	 * 
	 * @param object
	 * 		Implementado de acordo com o tipo de objeto.
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * @return
	 * 		true ou false.
	 * 
	 */
	public boolean existe(E object);
	
	/**
	 * <p>
	 * Verifica a quantidade específica de uma lista de {@code objeto} genérico de acordo 
	 * com a implementação. 
	 * </p>
	 * 
	 * @see
	 * 		com.joaobremgartner.vendas.models.*
	 * @return
	 * 		quantidade da lista de objetos.
	 */
	public int quantidadeExistente();
	public String toString();
}
