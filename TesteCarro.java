package oficina;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Corsa";
        carro.marcha = 1;
        carro.cor = "Preto";
        carro.motor = "V8";

        System.out.println(carro);
    }
}
