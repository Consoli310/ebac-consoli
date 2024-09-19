package dao.mocks;

public interface IContratoDao {
    void salvar();

    String buscar(String nome);

    String excluir(String nome);

    String atualizar(String nome);
}
