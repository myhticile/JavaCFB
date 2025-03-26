public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, int idade, String endereco, double salario, double ir, String cpf) {
        super(nome, idade, endereco, salario, ir); // Chama o construtor correto da classe Pessoa
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void imprimirCliente() {
        System.out.println("\n===== Dados do Cliente =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário Bruto: R$" + getSalario());
        System.out.println("Salário Líquido (Descontado IR): R$" + calcularSalarioLiquido());
    }
}