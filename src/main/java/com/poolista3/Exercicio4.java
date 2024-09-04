package com.poolista3;

import java.util.Scanner;
import java.util.Random;//classe que gera números aleatórios

public class Exercicio4 {
    public static void resolucao(){
        //4) Jogo da adivinhação.
        //Peça para alguém escolher um número.
        //Depois peça para outra pessoa tentar adivinhar.
        //O programa deverá retornar dicas como: "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio".
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();//Cria objeto randon para gerar num aleatórios
        
        int num = random.nextInt(20) + 1;//Gera num aleatório entre 1 e 20
        int palpite; //Armazena o palpite do usuário
        
        System.out.println("\n------------------------------------------------------\n");
        System.out.println("Escolha um número entre 1 e 20: ");
        scanner.nextLine();
        
        System.out.println("\nAgora, tente adivinhar o número escolhido!\n");
        
        //LOOP DE PALPITES
        //A condição é TRUE para que seja sempre verdadeiro.
        //Assim o loop continuará executando indefinidamente, a menos que seja interrompido de alguma forma.
        while (true) { 
            System.out.print("\nDigite seu palpite: ");
            palpite = scanner.nextInt();
            
            int diferencaAtual = Math.abs(palpite - num);//calcula a diferença entre o palpite e o num
            //MATH.ABS retorna o valor absoluto de um número.
            //Transforma números negativos em positivos e mantém os números positivos como estão.
            //A diferença precisa ser positiva para definir intervalos para dicas mais facilmente.
            
            if (palpite == num) {
                System.out.println("\nPARABÉNS! VOCÊ ACERTOU!");
                break;
            } else {
                if (diferencaAtual <= 5) {
                    System.out.println("\nQuase lá!");
                } else if (diferencaAtual <= 3) {
                    System.out.println("\nTá quente!");
                } else if (diferencaAtual <= 7) {
                    System.out.println("\nTá morno.");
                } else {
                    System.out.println("\nTá frio.");
                }
            }
        }
    }
}
