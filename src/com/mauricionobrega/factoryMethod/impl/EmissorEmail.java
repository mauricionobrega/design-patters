package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorEmail implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorEmail - Enviando por email a mensagem: " + mensagem);
    }

}