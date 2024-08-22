import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthday = sdf.parse(sc.next());

        Client client = new Client(name, email, birthday);

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), status, client);

        for (int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

    }
}