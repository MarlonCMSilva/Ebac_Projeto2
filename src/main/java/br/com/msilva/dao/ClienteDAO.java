/**
 * 
 */
package br.com.msilva.dao;

import br.com.msilva.dao.generics.GenericDAO;
import br.com.msilva.domain.Cliente;

/**
 * 
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO{
	
	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

	


}
