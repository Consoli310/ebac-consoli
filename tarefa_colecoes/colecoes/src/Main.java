import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String nomes = sc.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> listaNomes = Arrays.asList(nomesSeparados);

        Collections.sort(listaNomes);     // aqui deveria ordenar por ordem alfabética, mas está ordenando por tamanho de caracteres
        System.out.println("Nomes em ordem: ");
        System.out.println(listaNomes);

        //Parte 2

        System.out.print("Quantos nomes você vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arraySexos = new String[n];
        String[] arrayNomes = new String[n];
        for (int i = 0; i < n; i++){
            System.out.print("Digite o nome " + (i+1) + ": ");
            arrayNomes[i] = sc.nextLine();
            System.out.print("Qual o sexo? (m/f?): ");
            arraySexos[i] = sc.nextLine();
        }

        List<String> listNames = Arrays.asList(arrayNomes);
        List<String> listSexos = Arrays.asList(arraySexos);

        System.out.print("Nomes masculinos : ");
        for (int i = 0; i < n; i++) {
            if (Objects.equals(listSexos.get(i), "m")) {
                System.out.print(listNames.get(i) + " ");
            }
        }

        System.out.println();
        System.out.print("Nomes femininos : ");
        for (int i = 0; i < n; i++) {
            if (Objects.equals(listSexos.get(i), "f")) {
                System.out.print(listNames.get(i) + " ");
            }
        }







    }
}