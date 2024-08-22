import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String[] nomesSeparados;
        String path = "C:\\Users\\Consoli\\Documents\\Conteúdos\\teste.csv";
        String linha = "";
        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((linha = br.readLine()) != null) {

                nomesSeparados = linha.split(",");

                String name = nomesSeparados[0];
                Double price = Double.parseDouble(nomesSeparados[1]);
                int quantity = Integer.parseInt(nomesSeparados[2]);

                Product p1 = new Product(name, price, quantity);
                list.add(p1);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Product products : list){
            System.out.println(products);
        }
        String outPath = "C:\\Users\\Consoli\\Documents\\Conteúdos\\out\\summary.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
            for(Product products : list){
                bw.write(products.toString());
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
