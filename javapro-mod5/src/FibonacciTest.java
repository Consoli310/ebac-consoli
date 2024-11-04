import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testCalcular() {
        Fibonacci fibonacci = new Fibonacci();

        assertEquals("Fibonacci de 0 deve ser 0", 0, fibonacci.calcular(0));
        assertEquals("Fibonacci de 1 deve ser 1", 1, fibonacci.calcular(1));
        assertEquals("Fibonacci de 2 deve ser 1", 1, fibonacci.calcular(2));
        assertEquals("Fibonacci de 3 deve ser 2", 2, fibonacci.calcular(3));
        assertEquals("Fibonacci de 4 deve ser 3", 3, fibonacci.calcular(4));
        assertEquals("Fibonacci de 5 deve ser 5", 5, fibonacci.calcular(5));
        assertEquals("Fibonacci de 6 deve ser 8", 8, fibonacci.calcular(6));
        assertEquals("Fibonacci de 7 deve ser 13", 13, fibonacci.calcular(7));
    }
}
