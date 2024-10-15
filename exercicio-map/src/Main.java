import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> candidatos = new HashMap<>();

        String path = "C:\\Temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
               String[] data = line.split(",");
               String name = data[0];
               Integer votes = Integer.parseInt(data[1]);

               if (candidatos.containsKey(name)){
                   candidatos.put(name, candidatos.get(name) + votes);
               }else {
                   candidatos.put(name, votes);
               }
            }
        }catch(IOException e){
            System.out.println("Deu pau!");
        }

        for (Map.Entry<String, Integer> entry : candidatos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}
