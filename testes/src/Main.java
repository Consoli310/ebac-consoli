import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int destino = random.nextInt(2);

        if (destino == 0){
            System.out.println("Nani irá para a escola!");
       }else{
            System.out.println("Nani não irá para a escola!");
        }



    }
}