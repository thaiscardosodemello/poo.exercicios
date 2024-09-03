package com.poolista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        //7) Escreva um programa que receba quatro notas de um aluno e calcule a média aritmética dessas notas.

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("           Calculadora de Média das Notas");
        System.out.println("\n------------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("\nA média das notas é %.2f.%n", media);
        System.out.println("\n------------------------------------------------------\n");
    }

}
