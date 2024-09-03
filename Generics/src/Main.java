import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cars> cars = new ArrayList<>();

        cars.add(new Honda("Honda"));
        cars.add(new Civic("Civic"));
        cars.add(new Onix("Onix"));

        System.out.println(cars);

    }

}
