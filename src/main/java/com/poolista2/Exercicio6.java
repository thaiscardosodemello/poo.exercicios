package com.poolista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        //6) Crie um programa que receba as notas de um aluno e informe se ele foi aprovado ou reprovado.
        //Se o aluno ficar com média acima de 6 nas 2 primeiras provas ele passou.
        //Senão o programa deverá perguntar a nota de recuperação que irá substituir a menor nota.
        //A pergunta de recuperação deverá aparecer somente para os alunos que precisarem.

        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite a primeira nota: ");
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 6) {
            System.out.println("\n+--------------------------------------+\n");
            System.out.println("     Aluno aprovado com média " +media);
            System.out.println("\n+--------------------------------------+\n");
        } else {
            System.out.println("\n+-----------------------------------------------------+\n");
            System.out.println("   Aluno reprovado. Nota de recuperação necessária.");
            System.out.println("\n+-----------------------------------------------------+\n");

            System.out.print("Digite a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            //substitui menor nota
            double menorNota = Math.min(nota1, nota2); //MATH.MIN >> compara dois números e obter o menor deles
            double novaNota1 = (nota1 == menorNota) ? notaRecuperacao : nota1; //? >> retornar um valor com base na condição fornecida
            double novaNota2 = (nota2 == menorNota) ? notaRecuperacao : nota2;

            double novaMedia = (novaNota1 + novaNota2) / 2;

            if (novaMedia > 6) {
                System.out.println("\n+------------------------------------------------------------------------+\n");
                System.out.println("                     Aluno aprovado com a nova média " +novaMedia);
                System.out.println("\n+------------------------------------------------------------------------+\n");
            } else {
                System.out.println("\n+----------------------------------------------------------------+\n");
                System.out.println("   Aluno reprovado mesmo após a recuperação. Média final: " +novaMedia);
                System.out.println("\n+----------------------------------------------------------------+\n");
            }
        }
    }
}
