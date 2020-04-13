package de.daXinger.java.kapitel3;

public class LeereLehre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note = Integer.parseInt(args[0]);
		if (note <= 6 || note >=1) {
			switch (note) {
			case 1: System.out.println("sehr gut"); break;
			case 2: System.out.println("gut"); break;
			case 3: System.out.println("befriedigend"); break;
			case 4: System.out.println("ausreichend"); break;
			case 5: System.out.println("mangelhaft"); break;
			case 6: System.out.println("ungenügend"); break;
			}
		}
	}

}
