package com.mauricionobrega.abstractFactory;

public interface ComunicadorFactory {

    public Emissor createEmissor();

    public Receptor createReceptor();

}