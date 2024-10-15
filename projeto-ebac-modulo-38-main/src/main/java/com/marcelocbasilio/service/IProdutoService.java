package com.marcelocbasilio.service;

import java.util.List;

import com.marcelocbasilio.domain.Produto;
import com.marcelocbasilio.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
