package com.marcelocbasilio.projetocrudsingle.dao;

import com.marcelocbasilio.projetocrudsingle.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    Boolean cadastrar(Cliente cliente);
    void excluir(Long cpf);
    void alterar(Cliente cliente);
    Cliente consultar(Long cpf);
    Cliente buscarPorCpf(Long cpf);
    Collection<Cliente> buscarTodos();
}
