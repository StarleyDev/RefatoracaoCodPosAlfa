package br.com.starlley.nf;

public class ISS implements Imposto {

	public Double getValor(Double fatura) {
		return fatura * 0.1;
	}

}
