package tech.ada.ct.modelo;

public class Carro {

    //atributos (caracteristicas)
    private int quantidadePortas;
    private String cor;
    private int quantidadeRodas;
    private int ano;
    private String marca;
    private double peso;


    //construtor
    public Carro(String marca) {
        this.marca = marca;
    }

    //metodos (acoes)
    protected String ligarCambio(){
        return "Ligou carro";
    }
    public void acelerar(String motor){
        System.out.println(motor);
        System.out.println(this.marca);
    }
    public static void carregar(){
        //System.out.println(ligarCambio());
    };

}
