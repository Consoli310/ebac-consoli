public class Recursao {

    public static int fatorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + " é: " + fatorial(numero1)); // Saída esperada: 6
        System.out.println("Fatorial de " + numero2 + " é: " + fatorial(numero2)); // Saída esperada: 5040
    }
}
