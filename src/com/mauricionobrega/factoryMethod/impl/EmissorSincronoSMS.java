package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorSincronoSMS implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorSincronoSMS: " + mensagem);
    }

}