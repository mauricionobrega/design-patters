package com.mauricionobrega.factoryMethod.run;

import com.mauricionobrega.factoryMethod.Emissor;
import com.mauricionobrega.factoryMethod.creator.EmissorAssincronoCreator;
import com.mauricionobrega.factoryMethod.creator.EmissorCreator;
import com.mauricionobrega.factoryMethod.creator.EmissorSincronoCreator;
import com.mauricionobrega.factoryMethod.impl.EmissorEmail;
import com.mauricionobrega.factoryMethod.impl.EmissorJMS;
import com.mauricionobrega.factoryMethod.impl.EmissorSMS;

public class App {

    public static void main(String[] args) {

	// 1
	Emissor emissorSMS1 = new EmissorSMS();
	emissorSMS1.envia("K19 Treinamentos");
	Emissor emissorEmail1 = new EmissorEmail();
	emissorEmail1.envia("K19 Treinamentos");
	Emissor emissorJMS1 = new EmissorJMS();
	emissorJMS1.envia("K19 Treinamentos");

	System.out.println("");

	// 2
	EmissorCreator emissorCreator = new EmissorCreator();
	Emissor emissorSMS2 = emissorCreator.create(EmissorCreator.SMS);
	emissorSMS2.envia("K19 Treinamentos");
	Emissor emissorEmail2 = emissorCreator.create(EmissorCreator.EMAIL);
	emissorEmail2.envia("K19 Treinamentos");
	Emissor emissorJms2 = emissorCreator.create(EmissorCreator.JMS);
	emissorJms2.envia("K19 Treinamentos");

	System.out.println("");

	// 3.1
	EmissorCreator emissorAssincronoCreator = new EmissorAssincronoCreator();
	Emissor emissorAssincronoSms = emissorAssincronoCreator.create(EmissorCreator.SMS);
	emissorAssincronoSms.envia("K19 - Treinamentos");
	Emissor emissorAssincronoEmail = emissorAssincronoCreator.create(EmissorCreator.EMAIL);
	emissorAssincronoEmail.envia("K19 - Treinamentos");
	Emissor emissorAssincronoJms = emissorAssincronoCreator.create(EmissorCreator.JMS);
	emissorAssincronoJms.envia("K19 - Treinamentos");

	System.out.println("");

	// 3.2
	EmissorCreator emissorSincronoCreator = new EmissorSincronoCreator();
	Emissor emissorSincronoSms = emissorSincronoCreator.create(EmissorCreator.SMS);
	emissorSincronoSms.envia("K19 - Treinamentos");
	Emissor emissorSincronoEmail = emissorSincronoCreator.create(EmissorCreator.EMAIL);
	emissorSincronoEmail.envia("K19 - Treinamentos");
	Emissor emissorSincronoJms = emissorSincronoCreator.create(EmissorCreator.JMS);
	emissorSincronoJms.envia("K19 - Treinamentos");

    }

}
