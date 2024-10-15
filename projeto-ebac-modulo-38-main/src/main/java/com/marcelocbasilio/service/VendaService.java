package com.marcelocbasilio.service;

import javax.inject.Inject;

import com.marcelocbasilio.dao.IVendaDAO;
import com.marcelocbasilio.domain.Venda;
import com.marcelocbasilio.domain.Venda.Status;
import com.marcelocbasilio.service.generic.GenericService;

public class VendaService extends GenericService<Venda, Long> implements IVendaService {

	IVendaDAO dao;

	@Inject
	public VendaService(IVendaDAO dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public void finalizarVenda(Venda venda) {
		venda.setStatus(Status.CONCLUIDA);
		dao.finalizarVenda(venda);
	}

	@Override
	public void cancelarVenda(Venda venda) {
		venda.setStatus(Status.CANCELADA);
		dao.cancelarVenda(venda);
	}

	@Override
	public Venda consultarComCollection(Long id) {
		return dao.consultarComCollection(id);
	}

	@Override
	public Venda cadastrar(Venda entity) {
		entity.setStatus(Status.INICIADA);
		return super.cadastrar(entity);
	}

}
