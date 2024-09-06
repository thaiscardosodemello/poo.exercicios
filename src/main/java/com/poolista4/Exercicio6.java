package com.poolista4;

import java.util.ArrayList; //Usado para criar listas dinâmicas
import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
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
            System.out.println("(3) Remover item da lista");
            System.out.println("(4) Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextLine(); 

            switch (opcao) {
                case "1":
                    // Adiciona item à lista
                    System.out.print("\nAdicione um item (ou mais itens separados por vírgulas): ");
                    String itens = scanner.nextLine();
                    String[] itensArray = itens.split(",\\s*"); //Divide a string por vírgulas e espaços
                    for (String item : itensArray) {
                        listaDeCompras.add(item);
                    }
                    break;
                case "2":
                    // Vê lista
                    System.out.println("\nLista de Compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + "- " + listaDeCompras.get(i));
                        }
                    }
                    break;
                case "3":
                    // Remove item da lista
                    System.out.print("\nDigite o número do item a ser removido: ");
                    String input = scanner.nextLine();
                    
                    int itemIndex = -1; // Converte a entrada para um número
                    
                    // Verifica se o index é válido
                    if (itemIndex >= 0 && itemIndex < listaDeCompras.size()) {
                        listaDeCompras.remove(itemIndex);
                        System.out.println("Item removido com sucesso.");
                    } else {
                        System.out.println("Número do item inválido.");
                    }
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
            
        } while (!"4".equals(opcao));
    }
}
