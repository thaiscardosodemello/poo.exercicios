package com.poolista4;

public class Exercicio3 {
    public static void resolucao() {
        //3) Ainda utilizando o exercício do mercado, calcule o ticket médio de vendas do dia.
        
        double[] vendasDoDia = {19.90, 2.75, 63.50, 50.20};
        double soma = 0;

        //DOIS PONTOS itera sobre cada item no vetor. Não é preciso definir quantidade.
        for (double venda : vendasDoDia) {
            soma += venda;
        }
        double ticket = soma/vendasDoDia.length;//LENGTH fornece a quantidade de elementos no array

        System.out.printf("O ticket médio do dia é de R$%.2f.\n", ticket);
    }
}
