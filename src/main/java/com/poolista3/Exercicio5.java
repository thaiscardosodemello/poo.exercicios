package com.poolista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
        //5) Crie um algoritmo que receba login e senha e verifique as credenciais.
        //Caso algum deles estiver errado o programa deve retornar ao usuário quais das opções está errada, se é o login ou a senha.
        //O programa deve bloquear o acesso após 3 tentativas erradas.
        //Quando for a última tentativa ele deve emitir um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!"
       
        final String loginUsuario = "admin";
        final String senhaUsuario = "senha123";
        final int maxTentativas = 3;
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas < maxTentativas) {
            System.out.println("\n------------------------------------------------------\n");
            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            // Verifica as credenciais
            boolean loginCorretoDigitado = login.equals(loginUsuario);
            boolean senhaCorretaDigitada = senha.equals(senhaUsuario);

            if (loginCorretoDigitado && senhaCorretaDigitada) {
                System.out.println("\n+------------------------------------------------+\n");
                System.out.println("            Login e senha corretos.");
                System.out.println("\n+------------------------------------------------+\n");
                break; // Acesso concedido, encerra o loop
            } else {
                tentativas++;
                if (tentativas == maxTentativas) {
                    System.out.println("\n+------------------------------------------------+\n");
                    System.out.println("            Seu acesso foi bloqueado.");
                    System.out.println("\n+------------------------------------------------+\n");
                } else {
                    if (tentativas == maxTentativas - 1) {
                        System.out.println("\n+------------------------------------------------+\n");
                        System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                        System.out.println("\n+------------------------------------------------+\n");
                    } else {
                        System.out.println("\n+------------------------------------------------+\n");
                        System.out.println("Credenciais inválidas. Tente novamente.");
                        System.out.println("\n+------------------------------------------------+\n");
                    }
                    // Exibe quais credenciais estão erradas
                    if (!loginCorretoDigitado) {
                        System.out.println("               Login está incorreto.");
                    }
                    if (!senhaCorretaDigitada) {
                        System.out.println("               Senha está incorreta.");
                    }
                }
            }
        }   
    }
}
