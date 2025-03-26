import java.util.Scanner;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //CRIAR CLIENTE
        System.out.println("=== Cadastro de Cliente ===");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeCliente = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioCliente = scanner.nextDouble();
        System.out.print("Imposto de Renda (%): ");
        double irCliente = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();

        Cliente oCliente = new Cliente(nomeCliente, idadeCliente, enderecoCliente, salarioCliente, irCliente, cpfCliente);
        oCliente.imprimirCliente();

        scanner.close();
    }
}