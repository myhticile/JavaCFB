

public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;

    public Usuario(int id, String nome, String endereco, String email, byte receita) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.receita = receita;
    }

    public double calcularPrecoComDesconto(double precoMedicamento) {
        double desconto = 0;
        if (precoMedicamento > 100) {
            desconto = 0.15;
        } else {
            desconto = 0.10;
        }
        double precoFinal = precoMedicamento - (precoMedicamento * desconto);
        return precoFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getReceita() {
        return receita;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "João Silva", "Rua A, 123", "joao@email.com", (byte) 1);
        double precoMedicamento = 120.00;
        double precoComDesconto = usuario.calcularPrecoComDesconto(precoMedicamento);
        System.out.println("Preço original: R$ " + precoMedicamento);
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}
