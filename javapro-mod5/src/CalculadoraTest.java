import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testAdicionar() {
        assertEquals(5, calculadora.adicionar(2, 3));
        assertEquals(-1, calculadora.adicionar(2, -3));
        assertEquals(0, calculadora.adicionar(0, 0));
        assertEquals(10, calculadora.adicionar(5, 5));
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1, calculadora.subtrair(2, 3));
        assertEquals(5, calculadora.subtrair(2, -3));
        assertEquals(0, calculadora.subtrair(0, 0));
        assertEquals(0, calculadora.subtrair(5, 5));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-6, calculadora.multiplicar(2, -3));
        assertEquals(0, calculadora.multiplicar(0, 5));
        assertEquals(25, calculadora.multiplicar(5, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(6, -3));
        assertEquals(0, calculadora.dividir(0, 1));
        assertEquals(1, calculadora.dividir(5, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorZero() {
        calculadora.dividir(1, 0);
    }
}
