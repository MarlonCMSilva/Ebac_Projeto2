/**
 * 
 */
package br.com.msilva.services;

import java.util.Collection;

import br.com.msilva.dao.ClienteDAO;
import br.com.msilva.dao.IClienteDAO;
import br.com.msilva.dao.generics.GenericService;
import br.com.msilva.dao.generics.IGenericDAO;
import br.com.msilva.domain.Cliente;
import br.com.msilva.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 * 
 */

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IGenericDAO clienteDAO) {
		super(clienteDAO);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
