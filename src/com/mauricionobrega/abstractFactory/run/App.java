package com.mauricionobrega.abstractFactory.run;

import com.mauricionobrega.abstractFactory.ComunicadorFactory;
import com.mauricionobrega.abstractFactory.Emissor;
import com.mauricionobrega.abstractFactory.Receptor;
import com.mauricionobrega.abstractFactory.impl.MastercardComunicadorFactory;
import com.mauricionobrega.abstractFactory.impl.VisaComunicadorFactory;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

	testaVisaComunicadorFactory();

	System.out.println("------------");

	testaMastercardComunicadorFactory();

    }

    public static void testaVisaComunicadorFactory() {
	ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
	String transacao = "Valor=560;Senha=123";

	Emissor emissor = comunicadorFactory.createEmissor();
	emissor.envia(transacao);

	Receptor receptor = comunicadorFactory.createReceptor();
	String mensagem = receptor.recebe();

	System.out.println(mensagem);
    }

    public static void testaMastercardComunicadorFactory() {
	ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
	String transacao = "Valor=560;Senha=123";

	Emissor emissor = comunicadorFactory.createEmissor();
	emissor.envia(transacao);

	Receptor receptor = comunicadorFactory.createReceptor();
	String mensagem = receptor.recebe();

	System.out.println(mensagem);
    }

}