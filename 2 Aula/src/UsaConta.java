import java.util.Scanner;

public class UsaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        System.out.println("Digite o nome da primeira conta:");
        conta1.setNome(scanner.nextLine());

        System.out.println("Digite o nome da segunda conta:");
        conta2.setNome(scanner.nextLine());

        int opcao;

        do {
            System.out.println("Digite o valor para depositar na conta de " + conta1.getNome() + ": ");
            double valor1 = scanner.nextDouble();
            System.out.println("Digite o percentual de acréscimo para " + conta1.getNome() + ": ");
            double percentual1 = scanner.nextDouble();
            conta1.depositar(valor1, percentual1);

            System.out.println("Digite o valor para depositar na conta de " + conta2.getNome() + ": ");
            double valor2 = scanner.nextDouble();
            System.out.println("Digite o percentual de acréscimo para " + conta2.getNome() + ": ");
            double percentual2 = scanner.nextDouble();
            conta2.depositar(valor2, percentual2);

            System.out.println("\n--- Saldo Atualizado ---");
            System.out.println("Conta 1 - Nome: " + conta1.getNome());
            System.out.printf("Conta 1 - Saldo: %.2f\n", conta1.getSaldo());

            System.out.println("Conta 2 - Nome: " + conta2.getNome());
            System.out.printf("Conta 2 - Saldo: %.2f\n", conta2.getSaldo());

            System.out.println("\n Escolha uma opcao:");
            System.out.println("0 - Sair");
            System.out.println("1 - Calcular Novamente");
            opcao = scanner.nextInt();


        } while (opcao != 0);

        scanner.close();
    }
}
