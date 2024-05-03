public class Agencia {
    private int codigo;

    // Construtor vazio da classe Agencia
    public Agencia() {
    }

    // Construtor da classe Agencia
    public Agencia(int codigo) {
        this.codigo = codigo;
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Agencia
        Agencia agencia = new Agencia(1234); // Criando uma instância da classe Agencia com código 1234
        System.out.println("Código da agência: " + agencia.getCodigo());
    }
}
