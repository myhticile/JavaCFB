public class Leao extends Animal {

    private boolean juba;

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar() {
        System.out.println("O leão está caçando.");
    }

    public String descricaoJuba() {
        return juba ? "o leão tem juba." : "O leão não tem juba.";
    }
}