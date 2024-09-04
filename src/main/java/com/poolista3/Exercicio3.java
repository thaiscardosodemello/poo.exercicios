package com.poolista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){
        //3) Escreva um código que receba dois números inteiros e escreva todos os números pares entre eles.
       
        System.out.println("\n------------------------------------------------------\n");
        System.out.print("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        //encontra a número maior e menor
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("\nOs números pares entre " +menor+ " e " +maior+ " são: ");

        //constrói a lista para poder manipular
        StringBuilder resultado = new StringBuilder();
        //se eu fosse deixar só um espaço " " entre os número não tinha necessidade de construir a lista aqui

        //itera sobre o intervalo e mostra os números pares
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                if (resultado.length() > 0) { //LENGTH retorna o comprimento e garante que a vírgula e o espaço sejam adicionados apenas entre os números 
                    resultado.append(", "); //APPEND add texto ao final do conteúdo
                }
                resultado.append(i);
            }
        }
        System.out.println(resultado.toString());//envia a string gerada de StringBuilder resultado = new StringBuilder(); para o console
        
        System.out.println("\n------------------------------------------------------\n");

    }

}
