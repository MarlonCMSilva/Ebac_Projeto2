package br.com.msilva.dao.generics;

import java.io.Serializable;

import br.com.msilva.domain.Cliente;
import br.com.msilva.domain.Persistente;

public abstract  class GenericService<T extends Persistente, E extends Serializable> 
implements IGenericService<T, E> {
	
	protected IGenericDAO<T,E> dao;
	
	public GenericService(IGenericDAO<T,E> dao) {
		this.dao = dao;
	}
		
}
