public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double saldoInicial, PessoaJuridica pessoa, Agencia agencia, double taxaJuros) {
        super(saldoInicial, pessoa, agencia); // Chama o construtor da classe pai (Conta)
        this.taxaJuros = taxaJuros; // Inicializa a taxa de juros da conta poupança
    }

    // Métodos getters e setters para a taxa de juros
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    // Sobrescreve o método tipo para imprimir o tipo da conta (poupança)
    @Override
    public String tipo() {
        return "Conta Poupança";
    }
}
