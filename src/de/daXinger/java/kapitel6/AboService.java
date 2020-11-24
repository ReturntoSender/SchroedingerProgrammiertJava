package de.daXinger.java.kapitel6;

public class AboService {
	public static void main(String[] args) {
		Abo abo = new SuperPremiumAbo();
		System.out.println(abo.getPreisProJahr());
	}
}

class Abo {
	public Abo() {
		System.out.println("Neues Abo");
	}
	public double getPreisProJahr() {
		return 20.0;
	}
}

class PremiumAbo extends Abo {
	public PremiumAbo() {
		System.out.println("Neues Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr() *2;
	}
}

class SuperPremiumAbo extends PremiumAbo {
	public SuperPremiumAbo() {
		System.out.println("Neues Super-Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr() *2;
	}
}

