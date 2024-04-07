import java.util.Scanner;

public class Veiculo {
    protected int capacidadeDoTanque;
    protected int numeroPassageiros;
    protected double preco;

    public Veiculo(int capacidadeDoTanque, int numeroPassageiros, double preco) {
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
    public Veiculo() {
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    protected void entrada(Scanner scanner) {

    }

    protected void reajustarPreco(double percentual) {
    }
}
