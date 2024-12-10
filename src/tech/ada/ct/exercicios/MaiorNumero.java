package tech.ada.ct.exercicios;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros serão comparados?");
        int tamanho = entrada.nextInt();

        int[] numeros = new int[tamanho];

        //carregar os numeros no array
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o numero para a posicao %d: ", i);
            numeros[i] = entrada.nextInt();
            System.out.println();
        }

        //consultar o maior numero
        int maior = numeros[0];
        for(int i = 1; i < numeros.length; i++) {
            if(maior < numeros[i]) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior numero é " + maior);

    }

}
