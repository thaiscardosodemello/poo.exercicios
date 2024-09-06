package com.poolista4;

import java.util.ArrayList; // Usado para criar listas dinâmicas
import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        //6) Aproveite a questão anterior e adiciona a opção do usuário remover um item.

        // Constrói a lista de compras
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
            System.out.println("(3) Remover item da lista");
            System.out.println("(4) Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    //Adiciona item à lista
                    System.out.print("\nAdicione um item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("\nItem adicionado à lista.");
                    break;
                case 2:
                    //Vê lista
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + "- " + listaDeCompras.get(i));
                    }
                    break;
                case 3:
                    //Remove item da lista
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + "- " + listaDeCompras.get(i));//imprime a =
                    }
                    System.out.print("\nDigite o número do item a ser removido: ");
                    int index = scanner.nextInt() - 1; // ajusta o índice
                    if (index >= 0 && index < listaDeCompras.size()) {
                        listaDeCompras.remove(index);
                        System.out.println("\nItem removido da lista.");
                    } else {
                        System.out.println(\n"Número de item inválido.");
                    }
                    scanner.nextLine(); 
                    break;
                case 4:
                    System.out.println("\nSaindo do exercício ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
}
