import java.util.Scanner;

public class Animal {

    private float tamanho;
    private String cor;

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Tamanho inválido.");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        } else {
            System.out.println("Cor inválida.");
        }
    }

    public void comer(String comida) {
        System.out.println("O animal está comendo " + comida + ".");
    }
}