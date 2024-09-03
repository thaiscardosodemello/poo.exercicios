package com.poolista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        //3) Escreva uma calculadora que receba um valor em reais e converta para dólar. Considere o valor do dólar a R$5,25.

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("                Conversor de Reais para Dólares");
        System.out.println("\n------------------------------------------------------\n");

        System.out.print("Digite o valor em reais (R$): ");
        Scanner scanner = new Scanner(System.in);
        double valorEmReais = scanner.nextDouble();
        //SCANNER.NEXTDOUBLE >> lê a entrada do usuário e converter para um tipo de dado double.

        final double valorEmDolar = 5.25;
        //FINAL a variável previne que algo seja modificado/sobre escrito
        
        double valorFinal = valorEmReais / valorEmDolar;

        System.out.printf("\nO valor de R$%.2f em dólares é U$%.2f.\n", valorEmReais, valorFinal);
        /*PRINTF >> formata e exibe o texto na saída 
        %.2f >> pega o argumento e imprime com 2 casas depois da vírgula
        %n >> passa para a próxima linha (equivalente ao println()). */

        System.out.println("\n------------------------------------------------------\n");
        // scanner.close();         
    }

}
