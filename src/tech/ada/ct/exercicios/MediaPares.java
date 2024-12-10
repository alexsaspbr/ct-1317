package tech.ada.ct.exercicios;

public class MediaPares {

    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};

        int quantidadePares = 0;
        int somatoriaPares = 0;
        double media = 0.0;

        for(int numero : numeros) {
            if(numero % 2 == 0) {
                quantidadePares += 1;
                somatoriaPares += numero;
            }
        }

        media = somatoriaPares / quantidadePares;

        System.out.printf("A média dos numeros pares é %.2f", media);

    }

}
