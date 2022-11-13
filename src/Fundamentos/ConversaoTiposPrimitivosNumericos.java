package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; //Conversão implícita do tipo int para o tipo double
        System.out.println(a);

        float b = 3.0F; //Conversão explícita (CAST)
        System.out.println(b);
    }
}