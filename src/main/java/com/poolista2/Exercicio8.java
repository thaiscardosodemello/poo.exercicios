package com.poolista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        //8) Crie um joguinho de perguntas e respostas múltipla escolha.
        //O programa deverá fazer 5 perguntas (Uma por vez).
        //Se ele errar 3 vezes ele perde o jogo.
        //Se o usuário chegar até o final o programa deve exibir o número de acertos.


        System.out.println("\n------------------------------------------------------\n");
        String lolAscii = 
            "                   _      ____  _     \n" +
            "                  | |    / __ \\| |   \n" +
            "                  | |   | |  | | |    \n" +
            "                  | |   | |  | | |    \n" +
            "                  | |___| |__| | |____\n" +
            "                  |______\\____/|______\n";

        System.out.println(lolAscii);
        System.out.println("       Bem-vindo ao Quiz de League of Legends!");
        System.out.println("\n------------------------------------------------------\n");

        //array que define as perguntas
        String[] perguntas = {
            "Qual é o nome do mago que utiliza um livro de feitiços como arma?\n\nA) Ryze\nB) Lux\nC) Orianna\nD) Zoe",
            "Qual ultimate à seguir possui o menor tempo de recarga base no lv1?\n\nA) Rammus: Colisão\nB) Singed: Poção da Insanidade\nC) Jax: Grão-Mestre das Armas\nD) Zyra: Espinhos Sufocantes",
            "Skills Globais são habilidades ATIVAS de conjuração/re-conjuração de alcance ilimitado. Qual dos campeões à seguir NÃO possui uma Skill Global?\n\nA) Akali\nB) Warwick\nC) Nocturne\nD) Lilia",
            "Qual dos campeões à seguir nunca sofreu qualquer atualização gráfica?\n\nA) Karthus\nB) Twitch \nC) Twisted Fate\nD) Lucian",
            "Qual é o nome do modo de jogo onde os jogadores competem em uma única linha com uma quantidade limitada de campeões e habilidades?\n\nA) ARAM (All Random All Mid)\nB) Summoner's Rift\nC) Teamfight Tactics\nD) Nexus Blitz",
            "Qual dos campeões à seguir NÃO possui ATORDOAMENTO?\n\nA) Xerath \nB) Hwei \nC) Morgana \nD) Gragas",
            "Qual dos campeões à seguir possui alguma habilidade que é influenciada pela distância percorrida?\n\nA) K'Sante \nB) Nidalee \nC) Varus \nD) Naafiri",
            "Qual dos Campeões à seguir reside/residiu em Ionia?\n\nA) Jax \nB) Janna \nC) Xin Zhao \nD) Lilia",
            "No máximo, quantos inimigos a Katarina consegue alvejar com sua habilidade Lótus da Morte(R)?\n\nA) Não possui limite \nB) 10, incluindo não-campeões \nC) 3 \nD) 5" 
        };
        
        //array que define as respostas
        String[] respostasCorretas = { "A", "A", "C", "D", "A", "B", "B", "D", "3"};
        
        //zera o placas de erros e acertos
        int erros = 0;
        int acertos = 0;
        int totalPerguntas = perguntas.length; //armazena o num total de perguntas. O LENGTH retorna o num total de elementos no array
        // serve pra controlar o num de iteraçõe no loop
        
        for (int i = 0; i < totalPerguntas; i++) {
            System.out.print("\nPergunta " + (i + 1) + ": "); //num da pergunta
            Scanner scanner = new Scanner(System.in);
            System.out.println(perguntas[i]); //chama uma pergunta com as opções de resposta

            System.out.print("\nDigite a resposta: ");
            String resposta = scanner.next().toUpperCase(); //TOUPPERCASE converte todos os caracteres para maiúsculo
            
            //verifica resposta
            if (resposta.equals(respostasCorretas[i])) {
                System.out.println("\nRESPOSTA CORRETA!\n");
                acertos++;
            } else {
                System.out.println("\nRESPOSTA INCORRETA.\n");
                erros++;
            }
            
            // verifica a quantidade de erros
            if (erros >= 3) {
                System.out.println("\nVocê errou 3 vezes.\nFIM DE JOGO!");
                break;
            }
        }
        
        // Resultado final
        System.out.println("Você acertou " +acertos+ " de " +totalPerguntas+ " perguntas.");
    }
}
