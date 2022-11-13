package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos primitivos e seus valores

        byte a = 127; // Valor mínimo -128 | Valor máximo 127
        System.out.println(a);
        System.out.println("------------");

        short b = 32767; // Valor mínimo -32.768 | Valor máximo 32.767
        int c = 2022; // Valor mínimo -2.147.483.648 | Valor máximo 2.147.483.647
        System.out.println(b + "\n" + c);
        System.out.println("------------");

        // Tipo primitivos com partes fracionárias (ou ponto flutuante)

        float d = 1.0f; // Valor mín -3,4028E + 38 | Valor máx 3,4028E + 38 | Precisão: 6 - 7 dígitos
        double e = 1.0; // Valor mínimo -1,7976E + 308 | 1,7976E + 308 | Precisão: 15 dígitos
        System.out.println(d + "\n" + e);
        System.out.println("------------");

        //Tipo caractere
        char sexo = 'M';
        System.out.println(sexo);
        System.out.println("------------");

        //Tipo booleano
        boolean homem = true;
        System.out.println(homem);
        System.out.println("------------");

        // Variáveis e Constantes
        int f = 5;
        final double VALOR_DE_PI = 3.14;
        System.out.println(f + "\n" + VALOR_DE_PI);
        System.out.println("------------");

    }
}