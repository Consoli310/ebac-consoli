import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você quer digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> names = new ArrayList<>();
        List<String> sexos = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Nome da pessoa #" + (i + 1) + ": ");
            String tempNames = sc.nextLine();
            names.add(tempNames);
            System.out.println("Sexo da pessoa #" + (i + 1) + " (m/f): ");
            String tempSexos = sc.nextLine();
            sexos.add(tempSexos);
        }

        System.out.println();
        System.out.println("Grupo Masculino: ");
        for (int i = 0; i < names.size(); i++){
            if (Objects.equals(sexos.get(i), "m")){
                System.out.println(names.get(i));
            }
        }
        System.out.println();
        System.out.println("Grupo Feminino: ");
        for (int i = 0; i < names.size(); i++){
            if (Objects.equals(sexos.get(i), "f")){
                System.out.println(names.get(i));
            }
        }
    }
}