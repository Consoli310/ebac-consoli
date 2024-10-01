package test.dao;


import dao.domain.Cliente;
import dao.exceptions.DAOException;
import dao.exceptions.TipoChaveNaoEncontradaException;
import dao.generic.IClienteDAO;
import dao.services.generics.ClienteService;
import dao.services.generics.IClienteService;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Diego");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setEmail("email@email.com");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Diego");
        clienteService.alterar(cliente);

        Assert.assertEquals("Diego", cliente.getNome());
    }
}