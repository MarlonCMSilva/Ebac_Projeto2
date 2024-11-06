package br.com.msilva;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.msilva.dao.ClienteDAO;
import br.com.msilva.dao.ClienteDaoMock;
import br.com.msilva.dao.IClienteDAO;
import br.com.msilva.domain.Cliente;
import br.com.msilva.exceptions.TipoChaveNaoEncontradaException;
import br.com.msilva.services.ClienteService;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDAO;
	
	private Cliente cliente;
	
	public ClienteDAOTest(){
		clienteDAO = new ClienteDaoMock();
		
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException{
		cliente = new Cliente();
		cliente.setCpf(1234567890L);
		cliente.setNome("Marlon");
		cliente.setEndereco("end");
		cliente.setNumero(11);
		cliente.setCidade("São Paulo");
		cliente.setEstado("Sp");
		cliente.setTel(1199999999L);
		clienteDAO.cadastrar(cliente);
		
	}
	

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Nome alterado");
		clienteDAO.alterar(cliente);
		Assert.assertEquals("Nome alterado", cliente.getNome());
	}
	
	
}
