package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorAssincronoJMS implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorAssincronoJMS: " + mensagem);
    }

}