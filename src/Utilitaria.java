import java.util.Scanner;

public class Utilitaria {

    private Scanner entrada;

    public Utilitaria() {
    }

    public Utilitaria(Scanner entrada) {
        this.entrada = entrada;
    }

    public String gerarEntrada(String pergunta) {
        System.out.println(pergunta);
        return entrada.nextLine();
    }

}
