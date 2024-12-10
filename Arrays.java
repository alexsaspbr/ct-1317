package tech.ada.ct.modelo;

public class Arrays {

    public static void main(String[] args) {

        //primera forma de declaracao
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //segunda forma
        int[] numeros2 = {6,7,8,9,10};

        Carro[] carros = new Carro[2];
        carros[0] = new Carro("Fiat");
        carros[1] = new Carro("Volks");

        //while
/*      int index = 0;
        while (index < numeros.length) {
            System.out.println("Numero " + numeros[index]);
            index++;
        }*/

        //for
/*      for(int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + numeros[i]);
        }*/

        for(int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.println("Numero " + numero);
        }

        //foreach
        for(int numero : numeros) {
            System.out.println("Numero " + numero);
        }

        for(Carro carro : carros) {
            carro.acelerar("V8");
        }

    }

}
