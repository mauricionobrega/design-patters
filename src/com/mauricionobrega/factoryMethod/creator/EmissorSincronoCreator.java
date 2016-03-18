package com.mauricionobrega.factoryMethod.creator;

import com.mauricionobrega.factoryMethod.Emissor;
import com.mauricionobrega.factoryMethod.impl.EmissorSincronoEmail;
import com.mauricionobrega.factoryMethod.impl.EmissorSincronoJMS;
import com.mauricionobrega.factoryMethod.impl.EmissorSincronoSMS;

public class EmissorSincronoCreator extends EmissorCreator {

    @Override
    public Emissor create(int tipoDeEmissor) {
	if (tipoDeEmissor == EmissorCreator.SMS) {
	    return new EmissorSincronoSMS();
	} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
	    return new EmissorSincronoEmail();
	} else if (tipoDeEmissor == EmissorCreator.JMS) {
	    return new EmissorSincronoJMS();
	} else {
	    throw new IllegalArgumentException("Tipo de emissor não suportado");
	}
    }

}