package com.marcelocbasilio.dao;

import java.util.List;

import com.marcelocbasilio.dao.generic.IGenericDAO;
import com.marcelocbasilio.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
