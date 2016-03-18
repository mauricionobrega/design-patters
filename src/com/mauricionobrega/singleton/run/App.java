package com.mauricionobrega.singleton.run;

import com.mauricionobrega.singleton.Configuracao;

public class App {

    public static void main(String[] args) {
	Configuracao configuracao = Configuracao.getInstance();
	System.out.println(configuracao.getPropriedade("time-zone"));
	System.out.println(configuracao.getPropriedade("currency -code"));
    }

}
