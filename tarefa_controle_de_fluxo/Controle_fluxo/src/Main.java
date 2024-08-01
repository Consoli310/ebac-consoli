import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1, nota2, nota3, nota4;

    System.out.print("Digite as 4 notas do aluno: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Media = " + media);
            System.out.println(("APROVADO!"));
        }
        else {
            System.out.println("Media = " + media);
            System.out.println("REPROVADO");
        }

    }
}