import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int resultado = n * fatorial(n - 1);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 3 (Top-Down): " + fatorial(3)); // Saída esperada: 6
        System.out.println("Fatorial de 7 (Top-Down): " + fatorial(7)); // Saída esperada: 5040
    }
}
