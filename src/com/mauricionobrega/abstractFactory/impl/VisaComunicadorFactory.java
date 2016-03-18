package com.mauricionobrega.abstractFactory.impl;

import com.mauricionobrega.abstractFactory.ComunicadorFactory;
import com.mauricionobrega.abstractFactory.Emissor;
import com.mauricionobrega.abstractFactory.Receptor;
import com.mauricionobrega.abstractFactory.creator.EmissorCreator;
import com.mauricionobrega.abstractFactory.creator.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator = new EmissorCreator();
    private ReceptorCreator receptorCreator = new ReceptorCreator();

    public Emissor createEmissor() {
	return this.emissorCreator.create(EmissorCreator.VISA);
    }

    public Receptor createReceptor() {
	return this.receptorCreator.create(ReceptorCreator.VISA);
    }

}