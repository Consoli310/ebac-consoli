package com.marcelocbasilio.service;

import java.util.List;

import com.marcelocbasilio.domain.Cliente;
import com.marcelocbasilio.exceptions.DAOException;
import com.marcelocbasilio.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
