package de.daXinger.java.kapitel3;

public class Primzahlen {

	public static void main(String[] args) {
		
//		Betrachte alle Zahlen von 1 bis 100
		for (int i = 1; i < 100; i++) {

//			Annahme: i ist Primazahl
			boolean istPrimzahl = true;
			
//			Betrachte alle Zahlen j von 2 bis i-1			
			for (int j = 2; j < i; j++) {
				
//				Wenn i durch j geteilt werden kann
				if (i % j == 0) {
//					i ist doch keine Primzahl, und die Teilersuche kann abgebrochen werden
					istPrimzahl = false;
					break;
				}
			}
			if (istPrimzahl) System.out.println(i);
		}
	}

}
