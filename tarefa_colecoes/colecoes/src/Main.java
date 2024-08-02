import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String nomes = sc.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> listaNomes = Arrays.asList(nomesSeparados);

        Collections.sort(listaNomes);     // aqui deveria ordenar por ordem alfabética, mas está ordenando por tamanho de caracteres
        System.out.println(listaNomes);

        System.out.print("Digite nome com traço e sexo sendo -f ou -m");
        String nomeSexo = sc.nextLine();

        String[] nomeSexoSeparados = nomeSexo.split("-");
    }
}