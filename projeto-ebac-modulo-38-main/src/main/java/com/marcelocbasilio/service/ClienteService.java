package com.marcelocbasilio.service;

import java.util.List;

import javax.inject.Inject;

import com.marcelocbasilio.dao.IClienteDAO;
import com.marcelocbasilio.domain.Cliente;
import com.marcelocbasilio.exceptions.DAOException;
import com.marcelocbasilio.exceptions.MaisDeUmRegistroException;
import com.marcelocbasilio.exceptions.TableException;
import com.marcelocbasilio.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
