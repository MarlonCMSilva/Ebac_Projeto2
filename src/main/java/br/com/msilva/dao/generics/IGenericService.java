package br.com.msilva.dao.generics;

import java.io.Serializable;
import java.util.Collection;

import br.com.msilva.domain.Persistente;
import br.com.msilva.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable>{
	
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
    
    public void excluir(Long valor);
   
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long valor);

    public Collection<T> buscarTodos();

}
