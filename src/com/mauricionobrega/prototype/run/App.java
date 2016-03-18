package com.mauricionobrega.prototype.run;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import com.mauricionobrega.prototype.impl.Campanha;

public class App {

    public static void main(String[] args) {

	String nome = "K19";

	Calendar vencimento = Calendar.getInstance();
	vencimento.add(Calendar.DATE, 30);

	Set<String> palavrasChave = new HashSet<String>();
	palavrasChave.add("curso");
	palavrasChave.add("java");
	palavrasChave.add("k19");

	Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
	System.out.println(campanha);

	Campanha clone = campanha.clone();
	clone.addPalavraChave("nodejs");

	System.out.println(clone);
    }

}