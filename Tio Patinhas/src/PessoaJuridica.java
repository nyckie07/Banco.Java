// Subclasse PessoaJuridica
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome); // Chama o construtor
        this.cnpj = cnpj;
    }

    // Método getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Método setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
