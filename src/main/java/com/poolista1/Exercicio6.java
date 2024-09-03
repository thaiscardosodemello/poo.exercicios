package com.poolista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        //6) Construa um algoritmo que leia
        //1- a distância percorrida por um veículo em km
        //2- o total gasto em combustível em litros.
        //No final deverá ser respondido o consumo médio deste veículo em km/l.

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("     Calculadora de Consumo Médio de Combustível");
        System.out.println("\n------------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida pelo veículo em quilômetros (km): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite o total gasto em combustível em litros (l): ");
        double totalGastoCombustivel = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / totalGastoCombustivel;

        System.out.printf("\nO consumo médio do veículo é %.2f km/l%n", consumoMedio);
        System.out.println("\n------------------------------------------------------\n");
        // scanner.close(); 
    }

}
