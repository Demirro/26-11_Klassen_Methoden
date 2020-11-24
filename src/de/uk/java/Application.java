package de.uk.java;

public class Application {

	public static void main(String[] args) {
		
		// Neues Konto mit vorgegebenen Kontostand
		Konto konto1 = new Konto(1, "Mustermann", 30);
		// Neues Konto ohne vorgegebenen Kontostand
		Konto konto2 = new Konto(2, "Musterfrau");
		
		// In das erste Konto wird erst eingezahlt und dann ausgezahlt
		konto1.einzahlen(1);
		konto1.auszahlen(20);
		
		// Hier sollte eine Fehlermeldung kommen, da das Konto nicht genug gedeckt ist. 
		// Die Fehlermeldung kommt aus der Methode
		konto1.auszahlen(200);
		
		// Getter testen
		System.out.println(konto2.getKontostand());
		System.out.println(konto2.getId());
		System.out.println(konto2.getName());
	}

}
