public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private double salario;
    private double ir;

    public Pessoa(String nome, int idade, String endereco, double salario, double ir) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.salario = salario;
        this.ir = ir;
    }
    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //IDADE
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //ENDEREÇO
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //IMPOSTO DE RENDA
    public double getIr() {
        return ir;
    }
    public void setIr(double ir) {
        this.ir = ir;
    }

    public double calcularSalarioLiquido() {
        return salario - (salario * ir / 100);
    }
}