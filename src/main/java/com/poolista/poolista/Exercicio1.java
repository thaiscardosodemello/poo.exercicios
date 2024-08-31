package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao() {
        //1) Escreva um programa que faça a soma entre 2 números.
        
        int n1, n2;

        System.out.print("Digite o primeiro numero: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt(); // leia o próximo inteiro

        System.out.println("Digite o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("A soma é = "+(n1+n2));

    }
        
}
