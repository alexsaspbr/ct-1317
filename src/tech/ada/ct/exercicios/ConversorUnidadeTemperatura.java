package tech.ada.ct.exercicios;

import java.util.Scanner;

public class ConversorUnidadeTemperatura {

    enum UnidadeTemperatura {

        CELSIUS("C"), FAHRENHEIT("F"), KELVIN("K");

        private String sigla;

        UnidadeTemperatura(String sigla) {
            this.sigla = sigla;
        }

        public String getSigla() {
            return sigla;
        }

        public static UnidadeTemperatura getUnidadeTemperatura(String sigla) {
            for (UnidadeTemperatura unidadeTemperatura : values()) {
                if(sigla.equalsIgnoreCase(unidadeTemperatura.getSigla())){
                    return unidadeTemperatura;
                }
            }
            return null;
        }

        public Double converterTemperatura(String unidade, Double temperatura) {
            switch (this.getSigla().toUpperCase()) {
                case "C":
                    temperatura = this.converterCelsiusPara(unidade, temperatura);
                    break;
                case "F":
                    temperatura =  this.converterFahrenheitPara(unidade, temperatura);
                    break;
                case "K":
                    temperatura = this.converterKelvinPara(unidade, temperatura);
                    break;
            }
            return temperatura;
        }

        private Double converterFahrenheitPara(String unidade, Double temperatura) {
            Double novaTemperatura;
            switch (unidade.toUpperCase()) {
                case "C":
                    novaTemperatura = (temperatura - 32) * 5 / 9;
                    break;
                case "K":
                    novaTemperatura = (temperatura + 459.67) * 5 / 9;
                    break;
                default:
                    novaTemperatura = null;
                    break;
            }
            return novaTemperatura;
        }

        private Double converterCelsiusPara(String unidade, Double temperatura) {
            Double novaTemperatura;
            switch (unidade.toUpperCase()) {
                case "F":
                    novaTemperatura = (temperatura * 9 / 5) + 32;
                    break;
                case "K":
                    novaTemperatura = temperatura + 273.15;
                    break;
                default:
                    novaTemperatura = null;
                    break;
            }
            return novaTemperatura;
        }

        private Double converterKelvinPara(String unidade, Double temperatura) {
            Double novaTemperatura;
            switch (unidade.toUpperCase()) {
                case "F":
                    novaTemperatura = (temperatura * 9 / 5) - 459.67;
                    break;
                case "C":
                    novaTemperatura = temperatura - 273.15;
                    break;
                default:
                    novaTemperatura = null;
                    break;
            }
            return novaTemperatura;
        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a unidade de temperatura atual: C - CELSIUS, F - FAHRENHEIT, K - KELVIN");
        String unidadeOriginal = entrada.nextLine();

        System.out.println("Digite a temperatura");
        Double temperatura = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite a unidade de temperatura para conversao");
        String unidadeNova = entrada.nextLine();

        Double novaTemperatura = UnidadeTemperatura.getUnidadeTemperatura(unidadeOriginal).converterTemperatura(unidadeNova, temperatura);

        System.out.printf("Nova temperatura %.2f em %s \n", novaTemperatura, UnidadeTemperatura.getUnidadeTemperatura(unidadeNova).name().toLowerCase());

    }


}



