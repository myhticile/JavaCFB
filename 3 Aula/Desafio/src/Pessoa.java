import java.util.Scanner;

class Pessoa {
    private String cpf;
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String cpf, String nome, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
