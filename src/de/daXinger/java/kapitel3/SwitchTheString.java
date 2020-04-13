package de.daXinger.java.kapitel3;

public class SwitchTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			switch (args[0].toLowerCase()){
			case "sehr gut": System.out.println(1); break;
			case "gut": System.out.println(2); break;
			case "befriedigend": System.out.println(3); break;
			case "ausreichend": System.out.println(4); break;
			case "mangelhaft": System.out.println(5); break;
			case "ungenügend": System.out.println(6); break;
			default: System.out.println("Ungültiger Wert");
			}
		}
	}

}
