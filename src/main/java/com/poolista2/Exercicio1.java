package com.poolista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        //1) Escreva um programa que recebe um número digitado pelo usuário e responda se o número inserido é par ou ímpar ou 0

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt(); 

        //se o número é zero
        if (numero == 0) {
            System.out.println("\n> O número é zero!");
        //se o número é par
        } else if (numero % 2 == 0) {
            System.out.println("\n> O número é par!");
        //se não for zero nem par, então é ímpar
        } else {
            System.out.println("\n> O número é ímpar!");
        }
        System.out.println("\n------------------------------------------------------\n");

    }
}
