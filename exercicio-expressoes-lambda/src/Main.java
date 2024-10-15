import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();

        String path = "c:\\temp\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String [] vet = line.split(",");
                String name = vet[0];
                String email = vet[1];
                Double salary = Double.parseDouble(vet[2]);
                employee.add(new Employee(name, email, salary));
                line = br.readLine();

            }
        }catch(IOException e){
            System.out.println("Deu pau!");
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + salary);


        List<String> emailsFiltered = employee.stream()
                        .filter(e -> e.getSalary() > salary)
                        .map(Employee::getEmail)
                        .sorted()
                        .toList();

        emailsFiltered.forEach(System.out::println);

        List<Employee> namesFiltered = employee.stream()
                .filter(e -> e.getName().startsWith(String.valueOf("M")))
                .toList();

        double sum = namesFiltered.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

    }
}
