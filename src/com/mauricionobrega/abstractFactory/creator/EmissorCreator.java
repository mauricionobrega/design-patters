package com.mauricionobrega.abstractFactory.creator;

import com.mauricionobrega.abstractFactory.Emissor;
import com.mauricionobrega.abstractFactory.impl.EmissorMastercard;
import com.mauricionobrega.abstractFactory.impl.EmissorVisa;

public class EmissorCreator {

    public static final int VISA = 0;
    public static final int MASTERCARD = 1;

    public Emissor create(int tipoDeEmissor) {
	if (tipoDeEmissor == EmissorCreator.VISA) {
	    return new EmissorVisa();
	} else if (tipoDeEmissor == EmissorCreator.MASTERCARD) {
	    return new EmissorMastercard();
	} else {
	    throw new IllegalArgumentException("Tipo de emissor não suportado");
	}
    }

}