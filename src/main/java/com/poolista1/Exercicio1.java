package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao() {
        //1) Escreva um programa que faça a soma entre 2 números.
        
        int n1, n2;

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt(); // leia o próximo inteiro

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();

        System.out.print("\nA soma dos valores é igual a "+(n1+n2)+".\n");
        System.out.println("\n------------------------------------------------------\n");

        // scanner.close(); 
    }
        
}
