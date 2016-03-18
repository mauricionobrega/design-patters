package com.mauricionobrega.factoryMethod.impl;

import com.mauricionobrega.factoryMethod.Emissor;

public class EmissorSMS implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("EmissorSMS - Enviando por SMS a mensagem: " + mensagem);
    }

}