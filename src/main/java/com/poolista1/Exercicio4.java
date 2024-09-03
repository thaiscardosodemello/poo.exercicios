package com.poolista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        //4) Construa um algoritmo que leia um número inteiro na tela e responda o número antecessor e o sucessor.
        int num;

        System.out.println("\n------------------------------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = scanner.nextInt();

        int numAntecessor = num-1;
        int numSucessor = num+1;


        System.out.println("\nO número digitado " +num+ " possui como antecessor o número "+numAntecessor+" e como sucessor o número " +numSucessor+".");

        System.out.println("\n------------------------------------------------------\n");
    }

}
