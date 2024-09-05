package com.poolista4;

public class Exercicio4 {
    public static void resolucao(){
        //4) Escreva um código que irá percorrer uma lista de números inteiros
        //lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 }
        //e irá contar a quantidade de números pares presente nela

        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int numPares = 0;//Armazena os números pares
        
        for (int numero : lista) {
            if (numero % 2 == 0) {
                numPares++;
            }
        }
        System.out.println("\nA quantidade de números pares na lista é: " +numPares);
     
    }

}
