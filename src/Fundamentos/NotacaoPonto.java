package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String nome = "Ricardo";
        String nome2 = "RICARDO";

        nome = nome.concat(" Oliveira cost");
        nome = nome.toUpperCase();
        System.out.println(nome);

        nome2 = nome2.concat(" Oliveira cost");
        nome2 = nome2.replace("cost", "Costa");
        nome2 = nome2.toLowerCase();
        System.out.println(nome2);

    }
}