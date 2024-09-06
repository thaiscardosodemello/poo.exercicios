package com.poolista4;

import java.util.ArrayList; // Usado para criar listas dinâmicas
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
                    String[] itensArray = itens.split(",\\s*"); // Divide a string por vírgulas e espaços
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
                    System.out.println("\nRemover item da lista:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("\nLista vazia.");
                    } else {
                        // Exibe a lista atual
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + " - " + listaDeCompras.get(i));
                        }
                        System.out.print("\nQual item deseja remover? ");
                        int remocao;
                        //TRYCATCH permite executar o código e enquanto lida com alguma exceção sem interromper o programa
                        //TRY converte a entrada do usuário(STRING), para INT usando Integer.parseInt(). 
                        try {
                            //(remoção = captura)/ (Integer.parseInt(scanner.nextLine()) - 1; = processa)
                            remocao = Integer.parseInt(scanner.nextLine()) - 1; //integer converse a entrada int em string e -1 subtrai 1 do valor inteiro da conversão
                            if (remocao < 0 || remocao >= listaDeCompras.size()) { //|| é o mesmo que "ou"
                                System.out.println("Opção não existe na lista.");
                            } else {
                                listaDeCompras.remove(remocao);// remove a string recebida da lin62
                                System.out.println("Item removido da lista.");
                            }
                        //CATCH captura a exceção (e)
                        } catch (NumberFormatException e) { 
                            System.out.println("\nEntrada inválida. Por favor, insira um número.");
                        }
                        //NumberFormatException é uma classe que estende das classes IllegalArgumentException > RuntimeException > Throwable
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
