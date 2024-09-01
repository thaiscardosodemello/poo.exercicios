package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        //5) Construa um algoritmo que calcule o valor de um terreno baseado na sua área e valor por m2.
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a área do terreno em metros quadrados (m²): ");
        double areaDoTerreno = scanner.nextDouble();

        System.out.print("Digite o valor por metro quadrado (R$): ");
        double valorPorMetroQuadrado = scanner.nextDouble();

        double valorTotal = areaDoTerreno * valorPorMetroQuadrado;

        System.out.printf("O valor total do terreno é: R$ %.2f\n", valorTotal);

    }

}
