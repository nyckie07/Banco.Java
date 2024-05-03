public class Conta {
    private double saldo;
    private Pessoa cliente;
    private Agencia agencia;
    private int codigo;

    private static int contador = 0;

    public Conta(double saldoInicial, Pessoa cliente, Agencia agencia) {
        this.saldo = saldoInicial;
        this.cliente = cliente;
        this.agencia = agencia;
        this.codigo = ++contador;
    }

    // Método tipo
    public String tipo() {
        return ""; // Retorna vazio
    }

    // Métodos públicos
    public void consultar() {
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Código da Agência: " + agencia.getCodigo());
        System.out.println("Nome do Cliente: " + cliente.getNome());
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public int getCodigoAgencia() {
        return agencia.getCodigo();
    }
    public void exibirInformacoesDetalhadas() {
        System.out.println("Tipo de Conta: " + tipo());
        if (cliente instanceof PessoaFisica) {
            PessoaFisica clientePF = (PessoaFisica) cliente;
            System.out.println("CPF: " + clientePF.getCpf());
        } else if (cliente instanceof PessoaJuridica) {
            PessoaJuridica clientePJ = (PessoaJuridica) cliente;
            System.out.println("CNPJ: " + clientePJ.getCnpj());
        }
        System.out.println("Código da Agência: " + agencia.getCodigo());
        System.out.println("Nome do Cliente: " + cliente.getNome());
    }
    public void exibirInformacoes() {
        System.out.println("Tipo de Conta: " + tipo());
        if (cliente instanceof PessoaFisica) {
            PessoaFisica clientePF = (PessoaFisica) cliente;
            System.out.println("CPF do Cliente: " + clientePF.getCpf());
        } else {
            System.out.println("Tipo de cliente não suportado para exibição de CPF.");
        }
        System.out.println("Código da Agência: " + agencia.getCodigo());
        System.out.println("Nome do Cliente: " + cliente.getNome());
    }


    public void recarga(double valor) {
        if (valor > 0) {
            saldo -= valor;
            System.out.println("Recarga de R$ " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Valor inválido para recarga.");
        }
    }

    public void recarga() {
        double valorPadrao = 20.0;
        saldo -= valorPadrao;
        System.out.println("Recarga de R$ " + valorPadrao + " realizada com sucesso.");
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso da conta de " +
                    cliente.getNome() + " para a conta de " + contaDestino.cliente.getNome());
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente na conta de origem.");
        }
    }

    public static int getContador() {
        return contador;
    }
}