// Subclasse PessoaFisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String cpf) {
        super(nome); // Chama o construtor
        this.cpf = cpf;
    }

    // Método getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Método setter para o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
