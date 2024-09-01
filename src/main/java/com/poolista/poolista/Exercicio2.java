package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao() {
        //2) Escreva um programa que pergunte o nome e o sobrenome do usuário e escreva na tela: "Olá, -usuário-".

        String nome, sobrenome;

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("\n------------------------------------------------------\n");
        System.out.println("Olá, "+ nome +" "+sobrenome + "!");
        System.out.println("\n------------------------------------------------------\n");

        scanner.close(); 
    }

}
