import jpa.ClienteDAOTest;
import jpa.ClienteServiceTest;
import jpa.ProdutoDAOTest;
import jpa.ProdutoServiceTest;
import jpa.VendaDAOTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}