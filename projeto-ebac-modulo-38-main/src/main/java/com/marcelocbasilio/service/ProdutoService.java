package com.marcelocbasilio.service;

import java.util.List;

import javax.inject.Inject;

import com.marcelocbasilio.dao.IProdutoDAO;
import com.marcelocbasilio.domain.Produto;
import com.marcelocbasilio.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
