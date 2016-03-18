package com.mauricionobrega.builder.run;

import com.mauricionobrega.builder.Boleto;
import com.mauricionobrega.builder.BoletoBuilder;
import com.mauricionobrega.builder.generator.GeradorDeBoleto;
import com.mauricionobrega.builder.impl.BBBoletoBuilder;

public class App {

    public static void main(String[] args) {
	BoletoBuilder boletoBuilder = new BBBoletoBuilder();
	GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
	Boleto boleto = geradorDeBoleto.geraBoleto();

	System.out.println(boleto);
    }

}