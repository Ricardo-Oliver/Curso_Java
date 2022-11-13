package Desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double a = Math.pow(6 * (3 + 2), 2);
        double resultado1 = a / (3 * 2);

        double c = (1 - 5) * (2 - 7);
        double d = c / 2;
        double resultado2 = Math.pow(d, 2);

        double e = resultado1 - resultado2;
        double resultadoFinal = Math.pow(e, 3) / Math.pow(10, 3);

        System.out.println("Resultado: " + resultadoFinal);

    }
}