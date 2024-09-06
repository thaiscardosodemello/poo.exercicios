package com.poolista4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PoolistaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoolistaApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n---------------------------------------------\n");
            System.out.println("          LISTA 4 |  Array e Matriz");
            System.out.println("\n.............................................\n");
            System.out.println("1) Fechamento de Vendas");
            System.out.println("2) Compra de Menor e Maior Valor");
            System.out.println("3) Cálculo do Ticket Médio");
            System.out.println("4) Contar Números Pares");
            System.out.println("5) Lista de Compras - Inserir/Ver");
            System.out.println("6) Lista de Compras - Remover Item");
            System.out.println("7) Lista de Compras - Adicionar Preço");
            System.out.println("8) Lista de Compras - Ordenar por Preço");
            System.out.println("9) Sair");

            System.out.print("\nEscolha um exercício: ");
            opcao = scanner.nextLine();

            // Encerra o loop do menu
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
                    // Exercicio7.resolucao(); // Implementar o método no exercício 7
                    break;
                case "8":
                    // Exercicio8.resolucao(); // Implementar o método no exercício 8
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

        } while (!"9".equals(opcao));

        // Fechar o scanner após terminar de usar
        scanner.close();
    }
}
