import java.io.PrintStream;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        //for
        for(int cont=0; cont < 5; cont++){
            System.out.println(cont + " - Doceria Murk");
        }

        //while
        int max = scan.nextInt();
        int contad=0;

        while(contad < max){
            System.out.println(contad + " - Docinhos");
            contad++;

        }

        //do while
        int contag=0;

        do{
            System.out.println(contag+ " - USMODOCINHO");
            contag++;
        } while(contag <= 0);

        System.out.println("Fim do programa.");
    }
}