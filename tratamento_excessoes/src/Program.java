import entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account acc1 = new Account(balance, withdrawLimit, number, holder);

        System.out.println();
        System.out.print("Enter the amount for withdraw: ");
        Double amount = sc.nextDouble();

        try{
            acc1.withdraw(amount);
            System.out.print("New balance: " + acc1.getBalance());
        } catch (DomainException e){
        System.out.println(e.getMessage());
        }



    }
}
