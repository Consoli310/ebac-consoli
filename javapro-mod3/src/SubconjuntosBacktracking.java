import java.util.ArrayList;
import java.util.List;

public class SubconjuntosBacktracking {

    public static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void backtrack(int[] S, int n, int inicio, List<Integer> atual, List<List<Integer>> resultado) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            atual.add(S[i]);
            backtrack(S, n, i + 1, atual, resultado);
            atual.remove(atual.size() - 1); // desfaz a última adição
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println("Subconjuntos de tamanho " + n1 + " de " + java.util.Arrays.toString(S1) + ": " + gerarSubconjuntos(S1, n1));

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println("Subconjuntos de tamanho " + n2 + " de " + java.util.Arrays.toString(S2) + ": " + gerarSubconjuntos(S2, n2));
    }
}
