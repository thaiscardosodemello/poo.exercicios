package com.poolista3;

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
            System.out.println("         LISTA 3 | Laços e Repetição");
            System.out.println("\n---------------------------------------------\n");
            System.out.println("1) Cronômetro");
            System.out.println("2) Tabuada");
            System.out.println("3) Números Pares");
            System.out.println("4) Jogo da Adivinhação");
			System.out.println("5) Validação de Login");
			System.out.println("6) Pirâmide de Asteriscos");
			System.out.println("7) Retângulo de Asteriscos");
			System.out.println("8) Sair");

            System.out.print("\nEscolha um exercício: ");
			opcao = scanner.nextLine(); 

            //encerra o loop do menu
            if ("8".equals(opcao)) { 
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
					Exercicio5.resolucao();// finalizar
                    break;
				case "6":
					Exercicio6.resolucao();
                    break;
				case "7":
					Exercicio7.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
			
        } while (!"8".equals(opcao)); 

        scanner.close();
    }
}
