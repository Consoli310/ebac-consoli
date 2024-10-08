package main.dao.jdbc;


import main.dao.jdbc.main.dao.domain.Cliente;

import java.util.List;

public interface IClienteDAO {
    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public List<Cliente> consultarTodos() throws Exception;

    public Integer atualizar(Cliente cliente) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;
}