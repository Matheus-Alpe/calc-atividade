package br.edu.usj.ads.lpii.calculadora;

public class Operacao {

    public String calcular(String a, String operacao, String b) {

        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);

        Double resultado = aDouble + bDouble;

        switch (operacao) {
            case "soma":
                operacao = " + ";
                resultado = aDouble + bDouble;
                break;
            case "subtracao":
                operacao = " - ";
                resultado = aDouble - bDouble;
                break;
            case "divisao":
                operacao = " / ";
                resultado = aDouble / bDouble;
                break;
            case "multiplicao":
                operacao = " * ";
                resultado = aDouble * bDouble;
                break;
        }

        return new String(a + operacao + b + " = " + resultado);
    }
}
