package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorSincronoEmail implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorSincronoEmail: " + mensagem);
    }

}