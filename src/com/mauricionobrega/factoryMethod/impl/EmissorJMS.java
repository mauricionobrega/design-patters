package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorJMS implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorJMS - Enviando por JMS a mensagem: " + mensagem);
    }

}