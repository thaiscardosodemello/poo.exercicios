package com.poolista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        //3) Um banco contratou você para que escreva um programa que será utilizado pelo usuário em um tablet.
        //O programa irá fazer 3 perguntas e encaminhar o cliente para 2 filas. A fila comum e a fila preferencial.
        //Se o cliente atender a uma das condições a seguir ele deve ser encaminhado para a fila preferencial.
        //As condições são: Ter mais de 65 anos, se deficiente ou gestante.

        System.out.println("\n------------------------------------------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade?\n> ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Você é deficiente? (Digite 's' para 'sim' e 'n' para 'não')\n> ");
        String pcdResposta = scanner.nextLine().trim().toLowerCase();

        System.out.print("Você é gestante? (Digite 's' para 'sim' e 'n' para 'não')\n> ");
        String gestanteResposta = scanner.nextLine().trim().toLowerCase();

        //verifica o cliente
        boolean filaPreferencial = idade >= 65 || pcdResposta.equals("s") || gestanteResposta.equals("s");

        if (filaPreferencial) {
            System.out.println("\n+--------------------------------------+\n");
            System.out.println("     SIGA PARA A FILA PREFERENCIAL");
            System.out.println("\n+--------------------------------------+\n");
        } else {
            System.out.println("\n+--------------------------------------+\n");
            System.out.println("         SIGA PARA A FILA COMUM");
            System.out.println("\n+--------------------------------------+\n");
        }
    }
}
