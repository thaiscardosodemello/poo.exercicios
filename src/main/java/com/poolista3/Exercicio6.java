package com.poolista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        //6) Escreva um programa que seja capaz de desenhar uma pirâmide de asteriscos.
        //O usuário deverá informar quantos andares ele deseja que a pirâmide tenha.

        System.out.print("\nDigite a altura da pirâmide: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        System.out.print("\n");
        
        for (int i = 0; i < altura; i++) {
            //espaços em branco antes dos asteriscos
            for (int j = altura - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            //asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
