package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        //4) Construa um algoritmo que leia um número inteiro na tela e responda o número antecessor e o sucessor.
<<<<<<< HEAD
        
        int num;

        System.out.println("\n------------------------------------------------------\n");
=======
        int num;

>>>>>>> 9e08edb1d805bacedb5967e2812ad5ac3898985d
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = scanner.nextInt();

        int numAntecessor = num-1;
        int numSucessor = num+1;

<<<<<<< HEAD
        System.out.println("\nO número digitado " +num+ " possui como antecessor o número "+numAntecessor+" e como sucessor o número " +numSucessor+".");

        System.out.println("\n------------------------------------------------------\n");
        scanner.close(); 
=======
        System.out.println("O número digitado " +num+ " possui como antecessor o "+numAntecessor+" e como sucessor o " +numSucessor);
>>>>>>> 9e08edb1d805bacedb5967e2812ad5ac3898985d
    }

}
