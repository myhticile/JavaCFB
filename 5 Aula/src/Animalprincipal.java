import java.util.Scanner;

public class Animalprincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cavalo cavalo = new Cavalo();
        System.out.print("Digite o tamanho do cavalo (em metros): ");
        cavalo.setTamanho(scanner.nextFloat());
        scanner.nextLine();

        System.out.print("Digite a cor do cavalo: ");
        cavalo.setCor(scanner.nextLine());

        System.out.print("Digite a raça do cavalo: ");
        cavalo.setRaca(scanner.nextLine());

        System.out.print("Digite a comida que o cavalo vai comer: ");
        String comidaCavalo = scanner.nextLine();

        System.out.println("\n------Cavalo------\nRaça: " + cavalo.getRaca() + "\nCor: " + cavalo.getCor() + "\nTamanho: " + cavalo.getTamanho() + "m");
        cavalo.comer(comidaCavalo);
        cavalo.fugir();


        Leao leao = new Leao();
        System.out.print("\nDigite o tamanho do leão (em metros): ");
        leao.setTamanho(scanner.nextFloat());
        scanner.nextLine();

        System.out.print("Digite a cor do leão: ");
        leao.setCor(scanner.nextLine());

        System.out.print("O leão tem juba? (true/false): ");
        leao.setJuba(scanner.nextBoolean());
        scanner.nextLine();

        System.out.print("Digite a comida que o leão vai comer: ");
        String comidaLeao = scanner.nextLine();


        System.out.println("\n------Leão------\nCor: " + leao.getCor() + "\nTamanho: " + leao.getTamanho() + "m\n" +leao.descricaoJuba());
        leao.comer(comidaLeao);
        leao.cacar();
        scanner.close();
    }
}
