package dao.mocks.service;

public interface IContratoService {

    String salvar();

    String buscar(String nome);

    boolean excluir(String nome);

    String atualizar(Integer nome);
}
