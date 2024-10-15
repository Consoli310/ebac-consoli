package com.marcelocbasilio.service;

import com.marcelocbasilio.dao.generic.IGenericDAO;
import com.marcelocbasilio.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
