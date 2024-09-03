package com.poolista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        //2) Desenvolva um algoritmo que seja capaz de receber dois números digitados pelo usuário e diga qual deles é maior.

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt(); 

        //compara os números e exibe o maior
        if (num1 > num2) {
            System.out.println("\nO primeiro número ("+num1+") é o maior!");
        } else if (num2 > num1) {
            System.out.println("\nO segundo número ("+num2+") é o maior!");
        }
        System.out.println("\n------------------------------------------------------\n");  
    }
}
