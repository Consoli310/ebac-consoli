package dao.services.generics;


import dao.domain.Produto;
import dao.generic.IProdutoDAO;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}
