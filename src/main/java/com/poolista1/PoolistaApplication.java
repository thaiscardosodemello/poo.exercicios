package com.poolista1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PoolistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoolistaApplication.class, args);
        String opcao;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n---------------------------------------------\n");
            System.out.println("       LISTA 1 | Operações Matemáticas");
            System.out.println("\n---------------------------------------------\n");
            System.out.println("1) Soma entre 2 números");
            System.out.println("2) Olá, Usuário!");
            System.out.println("3) Converter reais para dólares");
            System.out.println("4) Número antecessor e sucessor");
			System.out.println("5) Calculadora de Valor de Terreno");
			System.out.println("6) Calculadora de Consumo Médio de Combustível");
			System.out.println("7) Calculadora de Média das Notas");
			System.out.println("8) Conversor de Temperatura");
			System.out.println("9) Sair");

            System.out.print("\nEscolha um exercício: ");
			opcao = scanner.nextLine(); // Lê a opção como uma string

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
					Exercicio4.resolucao();
                    break;
				case "5":
					Exercicio5.resolucao();
                    break;
				case "6":
					Exercicio6.resolucao();
                    break;
				case "7":
					Exercicio7.resolucao();
                    break;
				case "8":
					Exercicio8.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
			
        } while (!"9".equals(opcao)); 

        scanner.close();

	}
}
