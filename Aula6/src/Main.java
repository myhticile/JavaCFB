 public class Main{
    public static void main(String[] args){

        final int tam=5;
        char[] gabarito = {'a', 'c', 'b', 'a', 'b'};
        char[] respostas = new char[tam];
        int nota = 0;

        respostas[0] = 'a';
        respostas[1] = 'c';
        respostas[2] = 'a';
        respostas[3] = 'a';
        respostas[4] = 'b';

        for


        for (int i=0; i<tam; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("A nota do aluno é:%d", nota);
    }
 }
     /*   int[] num=new int[5];
        int[] numeros={10, 20, 30, 40, 50, 60, 70};
        num[0]=10;
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=89;

        for (int i = 0; i < num.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }
        // %d - INTEIRO - %f - FLOAT - %n - QUEBRA LINHA */