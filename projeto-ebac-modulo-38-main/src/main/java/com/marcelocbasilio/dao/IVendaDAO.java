package com.marcelocbasilio.dao;

import com.marcelocbasilio.dao.generic.IGenericDAO;
import com.marcelocbasilio.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
