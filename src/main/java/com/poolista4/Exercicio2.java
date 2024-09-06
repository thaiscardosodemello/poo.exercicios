package com.poolista4;

public class Exercicio2 {
    public static void resolucao() {
        //2) Agora que voce sabe o fechamento do dia, 
        //monte um código que identifique a compra de menor valor e a compra de maior valor.
        
        double[] vendasDoDia = {19.90, 2.75, 63.50, 50.20};
        double soma = 0;
        double menor = vendasDoDia[0];
        double maior = vendasDoDia[0];


        //DOIS PONTOS itera sobre cada item no vetor. Não é preciso definir quantidade.
        for (double venda : vendasDoDia) {
            soma += venda;

            if (venda < menor) {
                menor = venda;
            }

            if (venda > maior) {
                maior = venda;
            }
        }
        System.out.printf("/nCompra de menor valor: R$%.2f.\n", menor);
        System.out.printf("Compra de maior valor: R$%.2f.\n", maior);
    }
}
