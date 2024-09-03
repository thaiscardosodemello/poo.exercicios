package com.poolista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        //5) Crie um algoritmo que receba login e senha e verifique as credenciais.
        //Caso algum deles estiver errado o programa deve retornar ao usuário quais das opções está errada, se é o login ou a senha.

        System.out.println("\n------------------------------------------------------\n");
        //dados corretos
        String loginCorreto = "admin";
        String senhaCorreta = "senha123";

        System.out.print("Login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        //verifica as credenciais
        boolean loginCorretoDigitado = login.equals(loginCorreto);
        boolean senhaCorretaDigitada = senha.equals(senhaCorreta);

        if (!loginCorretoDigitado && !senhaCorretaDigitada) {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("            Login e senha incorretos.");
            System.out.println("\n+------------------------------------------------+\n");
        } else if (!loginCorretoDigitado) {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("               Login está incorreto.");
            System.out.println("\n+------------------------------------------------+\n");
        } else if (!senhaCorretaDigitada) {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("               Senha está incorreta.");
            System.out.println("\n+------------------------------------------------+\n");
        } else {
            System.out.println("\n+------------------------------------------------+\n");
            System.out.println("            Login e senha corretos.");
            System.out.println("\n+------------------------------------------------+\n");
        } 
    }
}
