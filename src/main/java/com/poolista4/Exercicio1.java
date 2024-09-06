package com.poolista4;

public class Exercicio1 {
    public static void resolucao() {
        // 1) Você é gerente de um supermercado e sabe que os valores das vendas do dia são gravados em um vetor.
        // Digite um código que faça o fechamento (soma) de vendas do dia de maneira automatizada.
        
        double[] vendasDoDia = {19.90, 2.75, 63.50, 50.20};
        double soma = 0;

        //DOIS PONTOS itera sobre cada item no vetor. Não é preciso definir quantidade.
        for (double venda : vendasDoDia) {
            soma += venda;
        }
        System.out.printf("\nO fechamento do dia é de R$%.2f.\n", soma);
        
    }
}
