package com.poolista2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PoolistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoolistaApplication.class, args);
        String opcao;

        do {
            System.out.println("\n=============================================\n");
            System.out.println("          MENU LISTA 2 DE EXERCÍCIOS");
            System.out.println("\n=============================================\n");
            System.out.println("1) Verificador de Paridade");
            System.out.println("2) Comparador de Números");
            System.out.println("3) Encaminhamento de Clientes para Filas");
            System.out.println("4) Verificador de Idade para Eventos");
			System.out.println("5) Validador de Login e Senha");
			System.out.println("6) Aprovado ou Reprovado");
			System.out.println("7) Identificador de Divisibilidade");
			System.out.println("8) Jogo de Perguntas e Respostas");
			System.out.println("9) Sair");

            System.out.print("\nEscolha um exercício: ");
            
		    Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextLine(); 
            // // scanner.close(); // Fechar o scanner

            //encerra o loop do menu
            if ("9".equals(opcao)) { 
                System.out.println("Saindo...");
                break; 
            }
            
            switch (opcao) {
                case "1":
					Exercicio1.resolucao();
                    break;
                case "2":
					Exercicio2.resolucao();
                    break;
                case "3":
					Exercicio3.resolucao();
                    break;
				case "4":
				//	Exercicio4.resolucao();
                    break;
				case "5":
				//	Exercicio5.resolucao();
                    break;
				case "6":
				//	Exercicio6.resolucao();
                    break;
				case "7":
				//	Exercicio7.resolucao();
                    break;
				case "8":
				//	Exercicio8.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
			
        } while (!"9".equals(opcao)); // Correção: Loop até que a opção 9 seja escolhida

	}
}
