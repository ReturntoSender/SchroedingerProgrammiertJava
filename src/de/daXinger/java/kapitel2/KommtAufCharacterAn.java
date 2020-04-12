package de.daXinger.java.kapitel2;

public class KommtAufCharacterAn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char eingabe = 'B';
		System.out.println("Eingabe ist ein Buchstabe: " + (Character.isLetter(eingabe)));
		System.out.println("Eingabe ist ein Kleinbuchstabe: " + (Character.isLowerCase(eingabe)));
	}

}
