import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<String> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used, or imported (c/u/i)? ");
            String c = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if (Objects.equals(c, "i")){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                ImportedProduct ip = new ImportedProduct(name, price, fee);
                list.add(ip.priceTag());
                sc.nextLine();
            }

            if (Objects.equals(c, "u")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                Date dateFormatada = sdf.parse(date);
                UsedProduct up = new UsedProduct(name, price, dateFormatada);
                list.add(up.priceTag());
            }

            if (Objects.equals(c, "c")){
                Product p = new Product(name, price);
                list.add(p.priceTag());
            }

        }

        System.out.println();
        System.out.println("Price tags");

        for (String product : list){
            System.out.println(product);
        }
    }
}
