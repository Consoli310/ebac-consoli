package dao.generic;


public interface IVendaDAO extends IGenericDAO<Venda, String> {
    Class<Venda> getTipoClasse();

    void atualiarDados(Venda entity, Venda entityCadastrado);

    void excluir(String valor);

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    String getQueryInsercao();

    Collection<Venda> buscarTodos() throws DAOException;

    Boolean cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException;
}