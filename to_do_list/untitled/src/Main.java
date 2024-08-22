import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        List <String> list = new ArrayList<>();

        boolean condition = true;

        while(condition) {
            System.out.println("*************************************************");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Ver lista");
            System.out.println("4 - Sair");
            System.out.println("*************************************************");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Digite o item: ");
                    String item = sc.nextLine();
                    list.add(item);
                    break;
                case 2:
                    System.out.println("Qual item você deseja remover? ");
                    int remover = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < list.size(); i++){
                        if (i == (remover - 1)){
                            list.remove(i);
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i < list.size(); i++){
                        System.out.println((i+1) + " - " + list.get(i));
                    }

                    break;
                case 4:
                    condition = false;
                    break;

            }
        }

    }
}