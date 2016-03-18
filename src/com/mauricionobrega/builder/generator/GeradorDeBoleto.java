package com.mauricionobrega.builder.generator;

import java.util.Calendar;

import com.mauricionobrega.builder.Boleto;
import com.mauricionobrega.builder.BoletoBuilder;

public class GeradorDeBoleto {

    private BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
	this.boletoBuilder = boletoBuilder;
    }

    public Boleto geraBoleto() {
	Calendar vencimento = Calendar.getInstance();
	vencimento.add(Calendar.DATE, 30);

	this.boletoBuilder.buildSacado("Marcelo Martins");
	this.boletoBuilder.buildCedente("K19 Treinamentos");
	this.boletoBuilder.buildValor(100.54);
	this.boletoBuilder.buildVencimento(vencimento);
	this.boletoBuilder.buildNossoNumero(1234);
	Boleto boleto = boletoBuilder.getBoleto();

	return boleto;
    }

}