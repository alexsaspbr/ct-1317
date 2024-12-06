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
    public void ligarCambio(){}
    public void acelerar(String motor){
        System.out.println(motor);
        System.out.println(this.marca);
    }
    public void carregar(){};

}
