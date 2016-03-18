package com.mauricionobrega.builder.impl;

import java.util.Calendar;

import com.mauricionobrega.builder.Boleto;
import com.mauricionobrega.builder.BoletoBuilder;

public class BBBoletoBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;

    public void buildSacado(String sacado) {
	this.sacado = sacado;
    }

    public void buildCedente(String cedente) {
	this.cedente = cedente;
    }

    public void buildValor(double valor) {
	this.valor = valor;
    }

    public void buildVencimento(Calendar vencimento) {
	this.vencimento = vencimento;
    }

    public void buildNossoNumero(int nossoNumero) {
	this.nossoNumero = nossoNumero;
    }

    public Boleto getBoleto() {
	return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
    }

}