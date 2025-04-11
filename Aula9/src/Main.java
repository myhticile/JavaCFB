public class Main{

    public static void main(String[] args) {


        msg("mo toquinha", 1);

        System.out.println(soma2(10,5));
        System.out.printf("\n%.1f", soma(1.5,1.2));
    }

    public static int soma(int... numero){
        int res = 0;
        for (int n:numero){
            res += n;
        }
        return res;
    }

    public static double soma(double... numero){
        double res = 0;
        for (double n:numero){
            res += n;
        }
        return res;
    }

    public static int soma2(int n1,int n2){
        int res;
        res = n1+n2;
        return res;
    }

    public static void msg (String m, int l){
        for (int i = 0; i < l; i++) {
            System.out.println(i+1 + " - " + m);
        }
    }
}