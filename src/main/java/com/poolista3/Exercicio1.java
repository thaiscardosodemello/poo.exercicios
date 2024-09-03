package com.poolista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        //1) Escreva um programa que sirva como um cronômetro.
        //O usuário deve digitar um número em segundos e o programa deve contabilizar os segundos digitados.
        //O programa deve receber somente números entre 1 e 59, do contrário ele retornar um erro e
        //solicitará que o usuário digite um número válido.
        
        Scanner scanner = new Scanner(System.in);
        int segundos;

        //DO WHILE >> garante que o código dentro do loop seja executado pelo menos uma vez
        //WHILE >> se o código deve ser executado somente quando a condição for verdadeira desde o início
        while (true) { //TRUE no WHILE loop nunca terminará sozinho e continuará executando indefinidamente
            System.out.print("Digite um número de segundos (entre 1 e 59): ");
            segundos = scanner.nextInt(); 

            if (segundos >= 1 && segundos <= 59) {
                break; // valor válido, sai do loop
            } else {
                System.out.println("\nNúmero fora do intervalo. Tente novamente.\n");
            }
        }

        // Contabiliza os segundos
        System.out.println("\nCronômetro iniciado para " +segundos+ " segundos...");
        for (int i = segundos; i > 0; i--) {
            System.out.println("> " +i+ " segundos restantes");
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                System.out.println("\nErro na contagem do cronômetro.\n");
            }
        }

        System.out.println("\n> > TEMPO ESGOTADO! < <\n");
    }    

}
