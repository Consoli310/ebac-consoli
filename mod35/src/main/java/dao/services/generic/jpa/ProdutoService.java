package dao.services.generic.jpa;

import dao.domain.jpa.Produto;
import dao.generic.jpa.IProdutoDAO;
import dao.services.generic.jpa.GenericService;
import dao.services.generic.jpa.IProdutoService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}