import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students for course A?");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            int student = sc.nextInt();
            sc.nextLine();
            students.add(student);
        }

        System.out.println(("How many students for course B?"));
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            int student = sc.nextInt();
            sc.nextLine();
            students.add(student);
        }

        System.out.println(("How many students for course C?"));
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            int student = sc.nextInt();
            sc.nextLine();
            students.add(student);
        }

        System.out.print("Total students: " + students.size());
    }
}
