package com.mauricionobrega.factoryMethod.creator;

import com.mauricionobrega.factoryMethod.Emissor;
import com.mauricionobrega.factoryMethod.impl.EmissorAssincronoEmail;
import com.mauricionobrega.factoryMethod.impl.EmissorAssincronoJMS;
import com.mauricionobrega.factoryMethod.impl.EmissorAssincronoSMS;

public class EmissorAssincronoCreator extends EmissorCreator {

    @Override
    public Emissor create(int tipoDeEmissor) {
	if (tipoDeEmissor == EmissorCreator.SMS) {
	    return new EmissorAssincronoSMS();
	} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
	    return new EmissorAssincronoEmail();
	} else if (tipoDeEmissor == EmissorCreator.JMS) {
	    return new EmissorAssincronoJMS();
	} else {
	    throw new IllegalArgumentException("Tipo de emissor não suportado");
	}
    }

}