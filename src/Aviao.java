import java.util.Scanner;

public class Aviao extends Veiculo{

    private String prefixo;
    private String dataRevisao;

    public Aviao(int capacidadeDoTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
        super(capacidadeDoTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }
    public Aviao() {
    }

    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade do Tanque: " + capacidadeDoTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
        System.out.println("Data de Revisão: " + dataRevisao);
    }

    public void entrada(Scanner scanner) {
        System.out.println("Digite o prefixo: ");
        prefixo = scanner.next();

        System.out.println("Digite a capacidade do tanque: ");
        capacidadeDoTanque = scanner.nextInt();

        System.out.println("Digite o número de passageiros: ");
        numeroPassageiros = scanner.nextInt();

        System.out.println("Digite o preço: ");
        preco = scanner.nextDouble();

        System.out.println("Digite a data de revisão: ");
        dataRevisao = scanner.next();
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }
}
