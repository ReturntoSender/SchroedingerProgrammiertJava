package de.daXinger.java.kapitel3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingSchroedinger {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hallo " + args[0] + ", willkommen in der World of Warcraft. Du befindest dich im Dorf Buxelknuxel.");
		System.out.println("Verwende die Tasten 'N', 'O', 'S' und 'W', um dich zu bewegen, und 'I', um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verlässt du das Spiel.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		int schritte = 0;
		while ((befehl = br.readLine() ) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Du gehst nach Norden.");
				schritte++;
				if (schritte >= 4) {
					krone();
					schritte = 0;	
				}
				break;
			case "o":
				System.out.println("Du gehst nach Osten.");
				schritte = 0;
				break;
			case "s":
				System.out.println("Du gehst nach Süden.");
				schritte = 0;
				break;
			case "w":
				System.out.println("Du gehst nach Westen.");
				schritte = 0;
				break;
			case "q":
				System.out.println("Willst du wirklich schon aufgeben? Y/N");
				String bestaetigung = br.readLine();
				switch (bestaetigung.toLowerCase()) {
				case "y":
					System.out.println("Und Tschüss.");
					System.exit(0);
					break;
				case "n":
					System.out.println("Finde ich prima.");
					break;
				}
				break;
			case "":
				System.out.println("Du willst gar nichts machen? Das glaube ich nicht.");
				break;
			case "i":
				System.out.println("Da du noch nicht die Weisheit der Array-kundigen Sammler erlangt hast, befindet sich in deinem Inventar nur ein einziger Gegenstand: ein Holzschwert.");
				break;
			default:
				System.out.println("Das verstehe ich nicht.");
			}
		}
	}
	
	public static void krone() {
		
		
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

	