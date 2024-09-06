package com.poolista4;

import java.util.ArrayList; // Usado para criar listas dinâmicas
import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        //5) Escreva um programa que sirva como uma lista de compras de mercado.
        //Você irá criar um menu que pergunte se o usuário quer inserir um item ou ver a lista.


        // Constrói a lista de compras
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("\n+------------------------+");
            System.out.println("     LISTA DE COMPRAS");
            System.out.println("+------------------------+");
            System.out.println("(1) Adicionar item na lista");
            System.out.println("(2) Ver lista de compras");
            System.out.println("(3) Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextLine(); 

            if ("3".equals(opcao)) { 
                System.out.println("Saindo...");
                break; 
            }
            
            switch (opcao) {
                case "1":
                    // Adiciona item à lista
                    System.out.print("\nAdicione um item (ou mais itens separados por vírgulas): ");
                    String itens = scanner.nextLine();
                    String[] itensArray = itens.split(",\\s*"); //string vetor recebe os itens e o SPLIT divide a string por vírgulas e espaços
                    for (String item : itensArray) {
                        listaDeCompras.add(item);
                    }
                    break;
                case "2":
                    // Vê lista
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + "- " + listaDeCompras.get(i));
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
            
        } while (!"3".equals(opcao));
    }
}
