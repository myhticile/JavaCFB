class CalculadoraIMC {
    public static double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static String verificarFaixaObesidade(double imc) {
        if (imc < 18.50) {
            return "Abaixo do peso";
        } else if (imc < 25.00) {
            return "Peso normal";
        } else if (imc < 30.00) {
            return "Pré-obesidade";
        } else if (imc < 35.00) {
            return "Obesidade grau 1";
        } else if (imc < 40.00) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}