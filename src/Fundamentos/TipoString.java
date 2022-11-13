package Fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Boa noite!".charAt(7));

        String a = "Bom dia";
        System.out.println(a.concat("!!!"));
        System.out.println(a.startsWith("Bom"));
        System.out.println(a.toLowerCase().startsWith("bom"));
        System.out.println(a.toUpperCase().endsWith("DIA"));
        System.out.println(a.equals("BOm dIa"));
        System.out.println(a.equalsIgnoreCase("bom dia"));


        var nome = "Ricardo";
        var sobrenome = "Oliveira";
        var idade = 25;

        System.out.printf("O %s %s, tem %d anos de idade.", nome, sobrenome, idade);

        String frase = String.format("\nO %s %s, tem %d anos de idade.", nome, sobrenome, idade);
        System.out.println(frase);
    }
}