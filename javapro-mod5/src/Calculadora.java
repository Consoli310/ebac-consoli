/**
 * A classe Calculadora fornece operações matemáticas básicas,
 * incluindo adição, subtração, multiplicação e divisão de inteiros.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return a soma de a e b
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return o resultado de a menos b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     *
     * @param a o dividendo
     * @param b o divisor
     * @return o quociente da divisão de a por b
     * @throws ArithmeticException se b for zero, pois a divisão por zero é indefinida
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não se pode dividir por 0");
        } else {
            return a / b;
        }
    }
}

