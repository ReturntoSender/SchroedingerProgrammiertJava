package de.daXinger.java.kapitel2;

public class AllesEineTypfrage {

	public static void main(String[] args) {
		if (args[0] != null) {
			Long zahl = Long.valueOf(args[0]);
			System.out.println(zahl + " passt in long Wertebereich: " + (zahl <= Long.MAX_VALUE && zahl >= Long.MIN_VALUE));
			System.out.println(zahl + " passt in int Wertebereich: " + (zahl <= Integer.MAX_VALUE && zahl >= Integer.MIN_VALUE));
			System.out.println(zahl + " passt in short Wertebereich: " + (zahl <= Short.MAX_VALUE && zahl >= Short.MIN_VALUE));
			System.out.println(zahl + " passt in byte Wertebereich: " + (zahl <= Byte.MAX_VALUE && zahl >= Byte.MIN_VALUE));
		}
		else System.out.println("Bitte eine Zahl eingeben.");
	}

}
