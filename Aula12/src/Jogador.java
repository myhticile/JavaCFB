public class Jogador {

    private int num=0;
    private int vidas=0;

    public Jogador(int num) {
        this.num = num;
        this.vidas = 3;
        System.out.printf("Jogador Nº%d criado.\n ", num);
    }

    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int v){
        vidas = v;
    }

}