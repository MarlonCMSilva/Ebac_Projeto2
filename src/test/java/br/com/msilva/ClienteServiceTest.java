package br.com.msilva;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.msilva.dao.ClienteDaoMock;
import br.com.msilva.dao.IClienteDAO;
import br.com.msilva.domain.Cliente;
import br.com.msilva.exceptions.TipoChaveNaoEncontradaException;
import br.com.msilva.services.ClienteService;
import br.com.msilva.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
		
	}
	
	@Before
	public void init(){
		cliente = new Cliente();
		cliente.setCpf(1234567890L);
		cliente.setNome("Marlon");
		cliente.setEndereco("end");
		cliente.setNumero(11);
		cliente.setCidade("São Paulo");
		cliente.setEstado("Sp");
		cliente.setTel(1199999999L);		
		
	}
	
	
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
		
	}
	
	
	@Test
	public void atualizarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Nome alterado");
		clienteService.alterar(cliente);
		Assert.assertEquals("Nome alterado", cliente.getNome());
	}

}
