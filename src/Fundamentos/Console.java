package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = input.nextLine();

        System.out.println("Type your lastname: ");
        String lastname = input.nextLine();

        System.out.println("Type your age: ");
        int age = input.nextInt();

        System.out.printf("My name is %s %s and I am %d years old", name, lastname, age);

    }
}