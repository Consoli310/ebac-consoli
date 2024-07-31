public class Media {

    public static double media(double x, double y, double z, double j) {
        return (x + y + z + j) / 4.0;
    }

    public static void main(String[] args) {


        double x = 8.5;
        double y = 4.0;
        double z = 3.5;
        double j = 10.0;

        double resultado = media(x, y, z, j);
        System.out.println("A média das notas é: " + resultado);
    }
}
