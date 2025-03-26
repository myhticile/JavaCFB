import java.util.Scanner;

public class ProgramaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite o seu CPF");
            String cpf = scanner.nextLine();

            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o seu peso(kg): ");
            double peso = scanner.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            Pessoa pessoa = new Pessoa(cpf, nome, peso, altura);
            double imc = CalculadoraIMC.calcularIMC(pessoa);
            String faixa = CalculadoraIMC.verificarFaixaObesidade(imc);

            System.out.printf("%s, Seu IMC é: %.2f\n", nome, imc);
            System.out.println("Classicação: " + faixa);

            System.out.println("Deseja calcular novamente?: (S/N)");
            String opcao = scanner.nextLine().trim().toUpperCase();
            if(opcao.equals("N")){
                System.out.println("Encerrando o programa...");
                break;
            }
        }
        scanner.close();
    }
}