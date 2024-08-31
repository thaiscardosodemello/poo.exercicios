package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao() {
        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        Scanner scanner1 = new Scanner(System.in);
        nome = scanner1.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner1.nextLine();

        System.out.println("Olá, "+ nome +" "+sobrenome + "!");


    }

}
