package com.poolista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){
        //7) Aproveitando o exercício anterior, escreva um programa que consiga construir um retângulo.
        //O usuário deve informar a largura e a altura em asteriscos.

        System.out.print("\nDigite a altura: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();

        System.out.print("\nDigite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("\n");
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            
        
    }
}
