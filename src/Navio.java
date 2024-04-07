import java.util.Scanner;

public class Navio extends Veiculo {

    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    public Navio() {
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public Navio(int capacidadeDoTanque, int numeroPassageiros, double preco, String nome, int numeroTripulantes, String dataLancamento) {
        super(capacidadeDoTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public Navio(int capacidadeDoTanque, int numeroPassageiros, double preco, String nome, int numeroTripulantes, String dataLancamento, String prefixo) {
        super(capacidadeDoTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento, String prefixo) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Capacidade do Tanque: " + capacidadeDoTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
        System.out.println("Número de Tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lançamento: " + dataLancamento);
    }

    public void entrada(Scanner scanner) {
        System.out.println("Digite o nome: ");
        nome = scanner.next();

        System.out.println("Digite a capacidade do tanque: ");
        capacidadeDoTanque = scanner.nextInt();

        System.out.println("Digite o número de passageiros: ");
        numeroPassageiros = scanner.nextInt();

        System.out.println("Digite o preço: ");
        preco = scanner.nextDouble();

        System.out.println("Digite o número de tripulantes: ");
        numeroTripulantes = scanner.nextInt();

        System.out.println("Digite a data de lançamento: ");
        dataLancamento = scanner.next();
    }
    public double passageirosPorTripulantes() {
        return (double) numeroPassageiros / numeroTripulantes;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
