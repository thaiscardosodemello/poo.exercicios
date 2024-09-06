package com.poolista4;

import java.util.ArrayList;//usado para fazer listas dinâmicas
import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
        //5) Escreva um programa que sirva como uma lista de compras de mercado.
        //Você irá criar um menu que pergunte se o usuário quer inserir um item ou ver a lista. 

         //constrói a lista de compras
         ArrayList<String> listaDeCompras = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);

        int opcao;         
        do {
            // Exibir o menu
            System.out.println("\n+------------------------+");
            System.out.println("     LISTA DE COMPRAS");
            System.out.println("+------------------------+");
            System.out.println("(1) Adiciona item na lista");
            System.out.println("(2) Ver lista de compras");
            System.out.println("(3) Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    //Add item na lista
                    System.out.print("Adicione um item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado à lista.");
                    break;
                case 2:
                    //Ver lista
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + "- " + listaDeCompras.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

}
