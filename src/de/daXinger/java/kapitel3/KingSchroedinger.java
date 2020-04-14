package de.daXinger.java.kapitel3;

public class KingSchroedinger {
	public static void main(String[] args) {
		
	
		final int breite = 17;
		final int halbebreite = (breite - 1) / 2;
		final int hoehe = halbebreite;
		final int letzteReihe = hoehe - 1;
		
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				switch (i) {
				
				case 0: System.out.print((j == halbebreite || j==0 || j == breite-1 ) ? "*" : " ");
						break;
				
				case letzteReihe: System.out.print(8);
						break;
						
				default: System.out.print((j < i || (j > halbebreite - i && j < halbebreite + i) || j >= breite - i) ? 0 : " ");
				}
			}
			System.out.println();
		}
	}
}
