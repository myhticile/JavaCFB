public class Main {

    //COMANDOS DE SAÍDA:
    public static void main(String[] args) {
        //Apenas PRINT
        System.out.print("CFB\n");

        //Print com QUEBRA DE LINHA
        System.out.println("Curso de JAVA");

        //Print FORMATADO | %s = STRING - %n ou \n = QUEBRA DE LINHA - %d = INT inteiro
        System.out.printf("Canal:%s%nAno:%d", "CFB Cursos", 2025);

        //####################################################################################################
        //####################################################################################################

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int res = n1 + n2 + n3;
        String nome = "mozin";

        System.out.printf("\nValor da variavel RES:%d%nNome: %s", res, nome);
    }
}