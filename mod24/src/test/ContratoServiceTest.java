package test;

import dao.mocks.ContratoDao;
import dao.mocks.ContratoDaoMock;
import dao.mocks.IContratoDao;
import dao.mocks.service.ContratoService;
import dao.mocks.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void testeBusca() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("Leandro");
        Assert.assertEquals("Cliente não encontrado. É necessário voltar e realizar o cadastro", retorno);
    }

    @Test
    public void exclusao() {
        //realizarei uma adição, para verificar se o cliente realmente está excluído!
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir("Leandro");
        Assert.assertEquals(false, retorno);

    }

    @Test(expected = NumberFormatException.class)
    public void atualizar() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar(1);
        Assert.assertEquals("Sucesso", retorno);

    }
}