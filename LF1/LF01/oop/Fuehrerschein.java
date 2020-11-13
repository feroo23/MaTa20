package oop;

import java.io.IOException;

public class Fuehrerschein {

	public static void main(String[] args) throws IOException {
		System.out.println("Gib Bitte dein alter in ganzzahlen ein: ");
		int alter = IO.readInteger();
		if(alter <= 14) {
			System.out.print("Du darfst Bobby-Car oder Fahrrad fahren.");
		}else if (alter <= 14 ) {
			System.out.println("Du darfst schon 50er fahren.");
		}else if  (alter <= 16) {
			System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
		}else if (alter >= 18  ) {
			System.out.println("Du darfst jetzt auch Auto fahren.");

		}
	
	}

}
