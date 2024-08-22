import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)?");
            String indOrCom = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (Objects.equals(indOrCom, "i")) {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();
                list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }

            if (Objects.equals(indOrCom, "c")) {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                sc.nextLine();
                list.add(new PessoaJuridica(name, anualIncome, employees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID");

        double sum = 0;

        for (Pessoa pessoa : list) {
            System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.payedTaxes(pessoa.getAnualIncome())));
            sum += pessoa.payedTaxes(pessoa.getAnualIncome());
        }

        System.out.print("TOTAL TAXES: $" + sum);

    }
}
