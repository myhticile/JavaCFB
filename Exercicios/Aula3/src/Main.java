public class Main {

    public static void main(String[] args) {

        int nota=80;
        int media=60;
        int faltas=10;
        int limFaltas=16;
        String result;

        int posic=7;

        switch(posic){
            case 1:
                System.out.println("Primeiro lugar!");
                break;
            case 2:
                System.out.println("Segundo lugar!");
                break;
            case 3:
                System.out.println("Terceiro lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participação.");
                break;
            default:
                System.out.println("Não ganhou porra nenhuma.");
                break;

        }





       /* result=(nota >= media ? "Aprovado" : "Reprovado");

        System.out.println("Resultado: " + result); */

        /*if (nota >= media && faltas <= limFaltas) {
            System.out.println("Aluno aprovado!");
        }else if (nota >= 40 && faltas <= limFaltas){
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }*/


    System.out.println("\nFim do programa...");
    }
}