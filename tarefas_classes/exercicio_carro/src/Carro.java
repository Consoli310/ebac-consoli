public class Carro {
    private int rodas;
    private int portas;


    public Carro(int portas, int rodas) {
        this.portas = portas;
        this.rodas = rodas;
    }

    //retorna o valor da quantidade de rodas
    public int getRodas() {
        return rodas;
    }

    //define a quantidade de rodas
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    //retorna a quantidade de portas
    public int getPortas() {
        return portas;
    }

    // define a quantidade de portas
    public void setPortas(int portas) {
        this.portas = portas;
    }
}
