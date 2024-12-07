import tech.ada.ct.modelo.Carro;

public class Main {

    public static void main(String[] args) {

        //String nome = "Alex Araujo";
        //System.out.printf("Ola mundo %s, Idade: %d Altura: %.2f \n", nome, 36, 1.764);
        /*System.out.printf("Ola mundo %s, Idade: %d Altura: %.2f \n",
                args[0], Integer.parseInt(args[1]), Float.parseFloat(args[2]));*/


        /*Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = input.nextLine();

        System.out.println("Digite sua idade");
        String idade = input.nextLine();

        System.out.println("Digite sua altura");
        String altura = input.nextLine();*/


//        Utilitaria utilitaria = new Utilitaria(new Scanner(System.in));
//        String nome = utilitaria.gerarEntrada("Digite seu nome");
//        String idade = utilitaria.gerarEntrada("Digite sua idade");
//        String altura = utilitaria.gerarEntrada("Digite sua altura");
//
//        System.out.printf("Ola mundo %s, Idade: %d Altura: %.2f \n",
//                nome, Integer.parseInt(idade), Float.parseFloat(altura));


  /*      boolean isAnimal = false;
        boolean isHumano = true;

        String resposta = isAnimal ? "É um animal" : (isHumano ? "É um humano" : "NÃO SEI O QUE É" ) ;
        System.out.println(resposta);*/

     /*  if(isAnimal) {
            return "É um animal";
        } else if (isHumano) {
            return "É um humano";
        } else {
            return "NÃO SEI O QUE É";
        }*/


        Carro carro = new Carro("Fiat");
        carro.acelerar("V8");
        Carro.carregar();


    }

}
