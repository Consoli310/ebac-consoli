import java.util.ArrayList;
import java.util.List;

public class Troco {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedasDisponiveis = {5, 2, 1};
        List<Integer> moedasUsadas = new ArrayList<>();

        int totalMoedas = 0;

        for (int moeda : moedasDisponiveis) {
            while (quantia >= moeda) {
                quantia -= moeda;
                moedasUsadas.add(moeda);
                totalMoedas++;
            }
        }

        System.out.println("Número mínimo de moedas necessárias: " + totalMoedas);
        System.out.println("Moedas usadas: " + moedasUsadas);
    }
}
