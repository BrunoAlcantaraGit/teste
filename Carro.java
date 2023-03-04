package oficina;

public class Carro {

    double velocidade;
    boolean ligado;

    int marcha;

    public void ligarDesligarCarro(){
        this.ligado = !this.ligado;
        System.out.println(this.ligado ? "Carro Ligado" : "Carro desligado");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeAtual=" + velocidade +
                ", ligado=" + ligado +
                ", marchaAtual=" + marcha +
                '}';
        System.out.println(" teste");
    }
}
