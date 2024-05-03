import java.util.Scanner;

public class BancoTioPatinhas {
    public static void main(String[] args) {
        // Instâncias de Cliente, Agencia e Conta
        PessoaFisica clientePF = new PessoaFisica("Papai Cris", "123.456.789-00");
        System.out.println("CPF do Cliente: " + clientePF.getCpf());
        PessoaJuridica clientePJ = new PessoaJuridica("Empresa SCCP", "00.000.000/0001-00");
        Agencia agencia = new Agencia(1234);
        Conta conta1 = new ContaCorrente(1000.0, clientePF, agencia, 100.0); // cria conta corrente
        Conta conta2 = new ContaPoupanca(2000.0, clientePJ, agencia, 0.05); // cria conta poupança

        // Informações das contas
        System.out.println("====== Informações da conta 1: ======");
        conta1.exibirInformacoes();
        System.out.println("====== Informações da conta 2: ======");
        conta2.exibirInformacoes();

        //entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int opcaoConta;
        int opcao;

        while (true) {
            exibirMenuContas();

            System.out.print("Escolha uma conta (ou 0 para sair): ");
            opcaoConta = scanner.nextInt();

            if (opcaoConta == 0) {
                System.out.println("Saindo...");
                scanner.close();
                return;
            }

            Conta contaSelecionada = (opcaoConta == 1) ? conta1 : conta2;

            while (true) {
                exibirMenuOperacoes();

                System.out.print("Escolha uma opção (ou 0 para voltar para o menu de contas): ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 0:
                        break;
                    case 1:
                        contaSelecionada.consultar();
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser transferido: ");
                        double valorTransferencia = scanner.nextDouble();
                        System.out.print("Escolha a conta destino (1 para Conta 1, 2 para Conta 2): ");
                        int opcaoDestino = scanner.nextInt();
                        Conta contaDestino = (opcaoDestino == 1) ? conta1 : conta2;
                        contaSelecionada.transferir(valorTransferencia, contaDestino); // realiza transferência entre as contas
                        break;
                    case 3:
                        System.out.print("Digite o valor da recarga: ");
                        double valorRecarga = scanner.nextDouble();
                        contaSelecionada.recarga(valorRecarga);
                        break;
                    case 4:
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = scanner.nextDouble();
                        contaSelecionada.depositar(valorDeposito);
                        break;
                    case 5:
                        contaSelecionada.exibirInformacoesDetalhadas();
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

                if (opcao == 0) {
                    break; // retorna ao menu
                }
            }
        }
    }

    private static void exibirMenuContas() {
        System.out.println("====== Escolha a conta ======");
        System.out.println("1. Conta 1");
        System.out.println("2. Conta 2");
        System.out.println("0. Sair");
    }

    private static void exibirMenuOperacoes() {
        System.out.println("====== Operações disponíveis ======");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar transferência");
        System.out.println("3. Realizar recarga");
        System.out.println("4. Realizar depósito");
        System.out.println("5. Exibir informações detalhadas da conta");
        System.out.println("0. Voltar para o menu de contas");
    }
}
