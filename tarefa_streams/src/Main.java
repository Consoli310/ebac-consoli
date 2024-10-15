import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Digite o nome e sexo das pessoas, separadas por vírgula");
        System.out.println("Exemplo: Marcio-m, Mariana-f, Eduardo-m, Luana-f");

        String nomesJuntos = sc.nextLine();

        String[] nomeSeparados = nomesJuntos.split(",");

        for(String nomes : nomeSeparados){
            lista.add(nomes);
        }

        List<String> listaMulheres = lista.stream()
                .filter(p -> p.split("-")[1].equals("f"))
                .toList();

        System.out.println("Lista das mulheres: ");
        listaMulheres.forEach(System.out::println);
        sc.close();

    }
}
