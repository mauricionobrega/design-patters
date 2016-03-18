package com.mauricionobrega.builder;

import java.util.Calendar;

public interface Boleto {

    public String getSacado();

    public String getCedente();

    public double getValor();

    public Calendar getVencimento();

    public int getNossoNumero();

    public String toString();

}