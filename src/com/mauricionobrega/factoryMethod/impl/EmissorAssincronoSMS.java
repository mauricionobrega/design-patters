package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorAssincronoSMS implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorAssincronoSMS: " + mensagem);
    }

}