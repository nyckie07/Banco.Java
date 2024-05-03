public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, PessoaFisica cliente, Agencia agencia, double limiteChequeEspecial) {
        super(saldoInicial, cliente, agencia); // Chama o construtor da classe pai (Conta)
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Métodos getters e setters
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Sobrescreve o método tipo para imprimir o tipo da conta (corrente)
    @Override
    public String tipo() {
        return "Conta Corrente";
    }
}
