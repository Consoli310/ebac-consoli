
package br.com.consoli.dao.jpa;

import br.com.rpires.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rpires.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
