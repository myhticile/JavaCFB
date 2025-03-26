public class Cavalo extends Animal {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.isEmpty()) {
            this.raca = raca;
        } else {
            System.out.println("Raça inválida.");
        }
    }

    public void fugir() {
        System.out.println("O cavalo está fugindo.");
    }
}
