package com.poolista4;

import java.util.ArrayList; // Usado para criar listas dinâmicas
import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        // 7) Aproveite o código que estamos utilizando e implemente um preço
        // para cada item (Dica. Utilizem outra lista e use os mesmos índices para
        // o item e para o preço).


        // Constrói a lista de compras e lista de preços
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String opcao;
        double valor;

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
                    // Adiciona item
                    System.out.print("\nAdicione um item (ou mais itens separados por vírgulas): ");
                    String[] itensArray = scanner.nextLine().split(",\\s*");

                    System.out.print("Adicione o preço correspondente (separado por vírgulas): ");
                    String[] precosArray = scanner.nextLine().split(",\\s*");

                    //o "commprimento da lista de itens" NÃO (!=) corresponde ao número de preços
                    if (itensArray.length != precosArray.length) {//verifica correspondecia de itens e precos
                        System.out.println("Erro: O número de itens e preços não corresponde.");
                    } else {
                        for (int i = 0; i < itensArray.length; i++) {//adiciona os itens e os preços
                            listaDeCompras.add(itensArray[i]);
                            listaDePrecos.add(Double.parseDouble(precosArray[i]));
                        }
                    } 
                    break;
                case "2":
                    // Vê lista
                    System.out.println("\nLista de Compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + "- " + listaDeCompras.get(i) + "    R$ " + listaDePrecos.get(i));
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
