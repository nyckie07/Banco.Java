// Superclasse Pessoa
public class Pessoa {
    private String nome;
    private int codigo;

    // Contador estático para gerar códigos únicos
    private static int contador = 0;

    // Construtor da classe Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
        this.codigo = ++contador;
    }

    // Método getter para o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método getter para o código da pessoa
    public int getCodigo() {
        return codigo;
    }

    // Método getter para o contador de objetos Pessoa
    public static int getContador() {
        return contador;
    }
}
