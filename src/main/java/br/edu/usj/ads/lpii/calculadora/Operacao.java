package br.edu.usj.ads.lpii.calculadora;

public class Operacao {

    private Double valorFinal;

    public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

    public String calcular(String a, String operacao, String b) {

        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);

        Double resultado = null;

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

        this.setValorFinal(resultado);
        return new String(a + operacao + b + " = " + resultado);
    }



	
}
