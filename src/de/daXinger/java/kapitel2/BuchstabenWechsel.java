package de.daXinger.java.kapitel2;

import java.io.IOException;

public class BuchstabenWechsel {

	public static void main(String[] args) throws IOException {
		int rotation = 6;
		System.out.println("Welcher Buchstabe soll gewechselt werden?");
		int eingabe = System.in.read();
		//System.out.println(eingabe);
		int offset = 64;
		int neuerBuchstabe = ((eingabe - offset + rotation) % 26) + offset;
		//System.out.println(neuerBuchstabe);
		System.out.println((char) neuerBuchstabe);
	}

}
