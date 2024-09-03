package com.poolista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
    //7) Escreva um programa Identificador de Divisibilidade, isto é,
    //que identifique se  um determinado número informado pelo usuário é divisível por X
    //(Que também deve ser informado pelo usuário)

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite o número que você quer verificar: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int div = scanner.nextInt();

        if (num % div == 0) {
            System.out.println("\n" +num+ " é divisível por " +div+ ".");
        } else {
            System.out.println("\n" +num+ " não é divisível por " +div+ ".");
        }
        System.out.println("\n------------------------------------------------------\n");

    }
}
