import java.util.Arrays;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        final int tam=10;
        int[] num = {1, 5, 2, 7, 2, 2 ,2 ,2 , 3, 6, 4, 2, 9, 8};
        int[] numeros=new int[tam];

        //Arrays.sort(num); //ordena os numeros
        //Arrays.fill(numeros, 10); // preenche o array com um numero

        //(inicio, lugar do array de inicio, destino, lugar do array de destino, distancia/tamanho)
        //System.arraycopy(num, 0, numeros, 0, tam); //copia um array para o outro

        Arrays.sort(num); // ordena os numeros
        System.out.printf("O elemento %d está no Array? %s, na posição %d\n", 3, Arrays.binarySearch (num, 3) > 0 ? "Sim" : "Não", Arrays.binarySearch (num, 3) + 1);//comparação de arrays.

        /*for(int i = 0; i<num.length; i++){
            System.out.printf("%d - ", num[i]);
        }*/

        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
    }
}