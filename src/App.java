import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aviao[] avioes = new Aviao[10];
        Navio[] navios = new Navio[10];

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Avião");
            System.out.println("2 - Navio");
            System.out.println("3 - Sair");

            int opcaoPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoPrincipal) {
                case 1:
                    menuAviao(avioes, scanner);
                    break;
                case 2:
                    menuNavio(navios, scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void menuAviao(Aviao[] avioes, Scanner scanner) {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Avião");
            System.out.println("2 - Listar Aviões");
            System.out.println("3 - Reajustar Preço do Avião");
            System.out.println("4 - Voltar");

            int opcaoAviao = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoAviao) {
                case 1:
                    criarAviao(avioes, scanner);
                    break;
                case 2:
                    imprimirAvioes(avioes);
                    break;
                case 3:
                    reajustarPrecoAviao(avioes, scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void menuNavio(Navio[] navios, Scanner scanner) {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Navio");
            System.out.println("2 - Listar Navios");
            System.out.println("3 - Passageiros por Tripulantes");
            System.out.println("4 - Voltar");

            int opcaoNavio = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoNavio) {
                case 1:
                    criarNavio(navios, scanner);
                    break;
                case 2:
                    imprimirNavios(navios);
                    break;
                case 3:
                    passageirosPorTripulantes(navios, scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void criarAviao(Aviao[] avioes, Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            if (avioes[i] == null) {
                try {
                    avioes[i] = new Aviao();
                    avioes[i].entrada(scanner);
                    return;
                } catch (Exception e) {
                    System.out.println("Erro: Entrada inválida.");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("Limite de aviões alcançado. Não foi possível cadastrar.");
    }
    public static void criarNavio(Navio[] navios, Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            if (navios[i] == null) {
                try {
                    navios[i] = new Navio();
                    navios[i].entrada(scanner);
                    return;
                } catch (Exception e) {
                    System.out.println("Erro: Entrada inválida.");
                    scanner.nextLine(); // Limpa o buffer do scanner
                }
            }
        }
        System.out.println("Limite de navios alcançado. Não foi possível cadastrar.");
    }
    public static void imprimirAvioes(Aviao[] avioes) {
        boolean vazio = true;
        for (Aviao aviao : avioes) {
            if (aviao != null) {
                aviao.imprimir();
                System.out.println();
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("Nenhum avião cadastrado.");
        }
    }
    public static void imprimirNavios(Navio[] navios) {
        boolean vazio = true;
        for (Navio navio : navios) {
            if (navio != null) {
                navio.imprimir();
                System.out.println();
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("Nenhum navio cadastrado.");
        }
    }

    public static void reajustarPrecoAviao(Aviao[] avioes, Scanner scanner) {
        System.out.println("Aviões cadastrados:");
        for (int i = 0; i < avioes.length; i++) {
            if (avioes[i] != null) {
                System.out.println((i + 1) + " - " + avioes[i].getPrefixo());
            }
        }

        System.out.println("Selecione o avião para reajustar o preço:");
        int indiceAviao = scanner.nextInt();
        scanner.nextLine();

        if (indiceAviao >= 1 && indiceAviao <= avioes.length && avioes[indiceAviao - 1] != null) {
            System.out.println("Digite o percentual de reajuste:");
            double percentual = scanner.nextDouble();

            double precoAtual = avioes[indiceAviao - 1].getPreco();
            double novoPreco = precoAtual * (1 + percentual / 100);

            avioes[indiceAviao - 1].setPreco(novoPreco);

            System.out.println("Preço reajustado com sucesso!");
        } else {
            System.out.println("Índice de avião inválido.");
        }
    }


    public static void passageirosPorTripulantes(Navio[] navios, Scanner scanner) {
        System.out.println("Navios cadastrados:");
        for (int i = 0; i < navios.length; i++) {
            if (navios[i] != null) {
                System.out.println((i + 1) + " - " + navios[i].getNome());
            }
        }

        System.out.println("Selecione o navio para calcular a relação passageiros por tripulantes:");
        int indiceNavio = scanner.nextInt();
        scanner.nextLine();

        if (indiceNavio >= 1 && indiceNavio <= navios.length && navios[indiceNavio - 1] != null) {
            double relacao = navios[indiceNavio - 1].passageirosPorTripulantes();
            System.out.println("Relação passageiros por tripulantes: " + relacao);
        } else {
            System.out.println("Índice de navio inválido.");
        }
    }
}
