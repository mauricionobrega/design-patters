package com.mauricionobrega.abstractFactory.impl;

import com.mauricionobrega.abstractFactory.Emissor;

public class EmissorMastercard implements Emissor {

    @Override
    public void envia(String mensagem) {
	System.out.println("Enviando a seguinte mensagem para a Mastercard:");
	System.out.println(mensagem);
    }

}