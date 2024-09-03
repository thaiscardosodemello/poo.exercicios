package com.poolista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        //4) Um cliente que promove eventos e solicitou um programa que seja capaz de identificar se uma pessoa é maior de idade.
        //Pessoas com menos de 16 anos não podem entrar nos eventos.
        //Entre 16 e 18 anos somente acompanhado pelos responsáveis.
        //Maiores de 18 podem entrar normalmente.

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite a idade: ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        
        //condição
        if (idade < 16) {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("          Não pode entrar no evento!");
            System.out.println("\n+------------------------------------------------+\n");
        } else if (idade >= 16 && idade <= 18) { //operador E lógico (ou AND lógico)
            System.out.println("\n+----------------------------------------------------------------+\n");
            System.out.println("    Pode entrar, mas deve estar acompanhada pelos responsáveis.");
            System.out.println("\n+----------------------------------------------------------------+\n");
        } else {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("        Pode entrar no evento normalmente.");
            System.out.println("\n+------------------------------------------------+\n");
        }
    }

}
