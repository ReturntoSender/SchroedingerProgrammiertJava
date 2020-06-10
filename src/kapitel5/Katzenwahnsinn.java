package kapitel5;

public class Katzenwahnsinn {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			machKatzen(100000);
			warten(5000);
		}
	}
	
	private static void machKatzen(int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			Katze katze = new Katze("Katze " + i);
		}
	}
	
	private static void warten (long millisekunden) {
		try {
			Thread.sleep(millisekunden);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
