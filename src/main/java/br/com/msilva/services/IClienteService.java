/**
 * 
 */
package br.com.msilva.services;

import br.com.msilva.dao.generics.IGenericService;
import br.com.msilva.domain.Cliente;
import br.com.msilva.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public interface IClienteService  {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente)throws TipoChaveNaoEncontradaException;

	Cliente consultar(Long valor);

	

}
