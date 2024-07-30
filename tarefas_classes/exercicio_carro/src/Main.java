public class Main {
    public static void main(String[] args) {

        // Como fizemos um construtor, o objeto precisa receber argumentos
        Carro carro = new Carro(0,0);
        //definindo novos valores para o carro
        carro.setRodas(4);
        carro.setPortas(2);

        // Mostrando no terminal a quantidade de rodas e portas, definidas anteriormente
        System.out.println(carro.getRodas());
        System.out.println(carro.getPortas());

        //Criando outro objeto carro
        // Desta vez definido os valores no próprio argumento
        Carro carro2 = new Carro(4,4);

        //Mostrando no terminal a quantidade de rodas e portas do carro2
        System.out.println(carro2.getRodas());
        System.out.println(carro2.getPortas());



    }
}