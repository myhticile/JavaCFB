import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1=0, n2=0, n3=0, n4=0, soma=0;
        final int media = 60;
        String nome, result="";

        System.out.println("Insira o nome do aluno: ");
        nome = scan.nextLine();

        System.out.printf("Insira a primeira nota de %s: ", nome);
        n1 = scan.nextInt();
        System.out.println("Segunda nota: ");
        n2 = scan.nextInt();
        System.out.println("Terceira nota: ");
        n3 = scan.nextInt();
        System.out.println("Quarta nota:");
        n4 = scan.nextInt();

        soma = n1 + n2 + n3 + n4;

        if (soma >= media){
            result = "aprovado";
        } else if (soma >= 40){
            result = "está em recuperação";
        } else {
            result = "reprovado";
        }

        System.out.printf("O aluno %s foi %s com nota final de %d.", nome, result, soma);
    }
}