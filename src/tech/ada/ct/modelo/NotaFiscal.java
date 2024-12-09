package tech.ada.ct.modelo;

public class NotaFiscal {

    public String gerarNF() {
        //validar dados do cliente
        validarDados();

        //validar dados cobranca
        validarDadosCobranca();

        //calcular tributos e valor final
        calcularTributos();

        calcularValores();

        return "NF";
    }

    public void validarDados() {}
    public void validarDadosCobranca(){

    }
    public void calcularTributos(){}
    private void calcularValores(){}


}
