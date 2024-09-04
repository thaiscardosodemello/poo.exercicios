package com.poolista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){
        //2) Desenvolva um programa que receba um número do usuário e escreva a tabuada dele.
        
        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        System.out.println("\n-------------------------\n");
        System.out.println("      TABUADA DE " +num);
        System.out.println("\n-------------------------\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
