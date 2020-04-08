package de.daXinger.java.kapitel1;
import java.io.IOException;

public class HalloSchroedinger {

	public static void main(String[] args) throws IOException {
		System.out.println("Hallo " + args[0]);
		System.out.println("Gib einen Wert ein:");
		int wert = System.in.read();
		System.out.println(wert);
	}

}
