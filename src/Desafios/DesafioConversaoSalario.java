package Desafios;
// Criar um classe chamada DesafioConversao, e com o Scanner capturar 3 Strings que será 3 possíveis
// salários de um funcionário, para calcular a média. Lembrando que deve ser tratado a inserção
// dos salários, pois o usuário poderá digitar os "valores" com vírgula ou ponto.

import java.util.Scanner;

public class DesafioConversaoSalario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o Primeiro salário: ");
        String salario1 = teclado.next().replace(",", ".");

        System.out.println("Informe o Segundo salário: ");
        String salario2 = teclado.next().replace(",", ".");

        System.out.println("Informe o Terceiro salário: ");
        String salario3 = teclado.next().replace(",", ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double mediaSalario = (valor1 + valor2 + valor3) / 3;

        System.out.println("A média dos salários informados é: " + mediaSalario);
        teclado.close();
    }
}