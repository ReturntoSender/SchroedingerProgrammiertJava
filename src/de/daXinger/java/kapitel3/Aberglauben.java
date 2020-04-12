package de.daXinger.java.kapitel3;

public class Aberglauben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			int parameter = Integer.parseInt(args[0]);
			if ( parameter % 7 == 0 || parameter % 13 != 0) {
				System.out.println("Glück gehabt.");
			} else System.out.println("Pech gehabt.");
		} 
		else {
			System.out.println("Keine Zahl übergeben.");
		}
	}

}
