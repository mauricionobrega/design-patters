package com.mauricionobrega.abstractFactory.impl;

import com.mauricionobrega.abstractFactory.Receptor;

public class ReceptorMastercard implements Receptor {

    @Override
    public String recebe() {
	System.out.println("Recebendo mensagem da Mastercard.");
	String mensagem = "Mensagem da Mastercard";
	return mensagem;
    }

}