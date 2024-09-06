package com.poolista4;

import java.util.ArrayList; // Usado para criar listas dinâmicas
import java.util.Collections; // Usado para ordenar listas
import java.util.Comparator; // Usado para definir a ordem de ordenação
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        //8) Aproveite os códigos anteriores e implemente a função de impressão por ordem de preço (crescente).

        // Constrói a lista de compras e lista de preços
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String opcao;

        do {
            System.out.println("\n+------------------------+");
            System.out.println("     LISTA DE COMPRAS");
            System.out.println("+------------------------+");
            System.out.println("(1) Adicionar item na lista");
            System.out.println("(2) Ver lista de compras");
            System.out.println("(3) Remover item da lista");
            System.out.println("(4) Ver lista de compras por ordem de preço");
            System.out.println("(5) Sair");
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
                    // Exibe lista ordenada por preço
                    System.out.println("\nLista de Compras Ordenada por Preço:");
                    // Lista que combina itens com preços
                    List<Item> itensComPrecos = new ArrayList<>();
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        //Para cada item, um novo objeto item(item+preço) é criado
                        itensComPrecos.add(new Item(listaDeCompras.get(i), listaDePrecos.get(i)));
                    }
                    
                    // Ordena a lista por preço
                    Collections.sort(itensComPrecos, Comparator.comparingDouble(Item::getPreco));/*DOIS PONTOS DOIS PONTOS Compara dois objetos */

                    // Exibe a lista ordenada
                    for (int i = 0; i < itensComPrecos.size(); i++) {
                        Item item = itensComPrecos.get(i);
                        System.out.printf("%d - %s    R$ %.2f%n", (i + 1), item.getNome(), item.getPreco());
                    }
                    break;

                case "5":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
            
        } while (!"5".equals(opcao));
    }

    //Armazenar o item e seu preço
    private static class Item {
        private final String nome;
        private final double preco;

        public Item(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        public String getNome() {
            return nome;
        }
        public double getPreco() {
            return preco;
        }
    }
}
