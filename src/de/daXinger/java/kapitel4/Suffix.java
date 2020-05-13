package de.daXinger.java.kapitel4;

public class Suffix {
	public static void main(String[] args) {
		String wort1 = args[0];
		String wort2 = "Fischerei";
		String gleich = "";
		
		for(int i = wort1.length()-1; i >= 0; i--) {
			String teilString = wort1.substring(i);
			if(wort2.endsWith(teilString)) {
				gleich = teilString;
			}
			else break;
		}
		
		System.out.println(gleich);
		
		
	}
}
