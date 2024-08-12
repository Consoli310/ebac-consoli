package com.marcelocbasilio.projetocrudsingle.dao;

import com.marcelocbasilio.projetocrudsingle.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {

    final private Map<Long, Cliente> clientes;

    public ClienteMapDAO() {
        this.clientes = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.clientes.containsKey(cliente.getCpf())) {
            return false;
        }
        this.clientes.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.clientes.get(cpf);

        if (clienteCadastrado != null) {
            this.clientes.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.clientes.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.clientes.get(cpf);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
       return this.clientes.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.clientes.values();
    }
}
