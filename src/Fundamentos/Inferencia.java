package Fundamentos;

public class Inferencia {
    /* Quando uma variável é declarada com o “tipo” var
     * o Java automaticamente faz a inferência de tipo,
     * ou seja, vai determinar o tipo daquela variável, através do valor atribuído.
     */
    public static void main(String[] args) {

        var a = 4;

        System.out.println(a);
    }
}