public class Fornecedor extends Pessoa {
    private double valorProduto;
    private double imposto;
    private String cnpj;

    // Construtor que chama a superclasse corretamente
    public Fornecedor(String nome, int idade, String endereco, double salario, double ir, double valorProduto, double imposto, String cnpj) {
        super(nome, idade, endereco, salario, ir); // Inicializa atributos da classe pai
        this.valorProduto = valorProduto;
        this.imposto = imposto;
        this.cnpj = cnpj;
    }

    public double getValorProduto() { return valorProduto; }
    public void setValorProduto(double valorProduto) { this.valorProduto = valorProduto; }

    public double getImposto() { return imposto; }
    public void setImposto(double imposto) { this.imposto = imposto; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    // Método para calcular o valor final do produto com imposto
    public double calcularPrecoFinal() {
        return valorProduto + (valorProduto * imposto / 100);
    }

    // Método para imprimir os dados do fornecedor
    public void imprimirFornecedor() {
        System.out.println("\n===== Dados do Fornecedor =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Salário Bruto: R$" + getSalario());
        System.out.println("Salário Líquido (Descontado IR): R$" + calcularSalarioLiquido());
        System.out.println("Valor do Produto: R$" + getValorProduto());
        System.out.println("Imposto sobre o Produto: " + getImposto() + "%");
        System.out.println("Preço Final do Produto: R$" + calcularPrecoFinal());
    }
}