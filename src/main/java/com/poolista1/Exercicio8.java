package com.poolista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        //8) Suponha que você trabalhe em um laboratório e seu colega mediu a temperatura de um objeto em Fahrenheit.
        //Escreva um programa capaz de converter em Celsius.

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("  Conversor de Temperatura: Fahrenheit para Celsius");
        System.out.println("\n------------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (5.0 / 9) * (temperaturaFahrenheit - 32);

        System.out.printf("\nA temperatura em Celsius é: %.2f°C%n", temperaturaCelsius);
        System.out.println("\n------------------------------------------------------\n");
        // scanner.close(); 
    }

}
