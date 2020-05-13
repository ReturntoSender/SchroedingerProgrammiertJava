package de.daXinger.java.kapitel3;

public class Kalender {
	public static void main (String[] args0 ) {
		
		int monat = 1;
		int startTag = 4;
		int tage = 0;


		
		if (monat >= 0 && monat < 12 && startTag >= 0 && startTag < 7) {
			switch (monat) {
			case 0: case 2: case 4: case 6: case 7: case 9: case 11:
				tage = 31;
				break;
			case 1:
				tage = 28;
				break;
			default: 
				tage = 30;
				break;
			}
		}
		
		int wochen = (tage + startTag) > 35 ? 6 : 5;
		
		System.out.println("|MO|DI|MI|DO|FR|SA|SO|");
		
		for (int woche = 1; woche <= wochen; woche++) {
			for (int tag = 1; tag <= 7; tag++) {
				int datum = tag+(woche-1)*7 - startTag;
				if (datum > 0 && datum <= tage) {
					System.out.print("|" + ((datum < 10 ) ? " " : "") + datum);
				}
				else {
					System.out.print("|  ");
				}
			}
			System.out.println("|");
		}
		
	}
}
