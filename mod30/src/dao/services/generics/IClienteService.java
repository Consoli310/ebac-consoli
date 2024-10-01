package dao.services.generics;


import dao.domain.Cliente;
import dao.exceptions.DAOException;

public interface IClienteService extends IGenericService<Cliente, Long> {
    Cliente buscarPorCPF(Long cpf) throws DAOException;
}