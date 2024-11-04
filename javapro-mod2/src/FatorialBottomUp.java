public class FatorialBottomUp {

    public static int fatorial(int n) {
        int[] tabela = new int[n + 1];
        tabela[0] = 1;
        if (tabela.length >= 2) {
            tabela[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            tabela[i] = i * tabela[i - 1];
        }
        return tabela[n];
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 3 (Bottom-Up): " + fatorial(0));
        System.out.println("Fatorial de 7 (Bottom-Up): " + fatorial(7));
    }
}
