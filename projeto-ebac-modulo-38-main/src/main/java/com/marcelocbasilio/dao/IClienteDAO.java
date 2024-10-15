package com.marcelocbasilio.dao;

import java.util.List;

import com.marcelocbasilio.dao.generic.IGenericDAO;
import com.marcelocbasilio.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
