package WachstumUndZerfall;

import java.io.IOException;

import oop.IO;

public class Zellwachstum {

	public static void main(String[] args) throws IOException {
		System.out.print("Bitte die aktulle Zellen Menge eingaben: ");
		int zellenmenge = IO.readInteger();
		System.out.print("Bitte den Wachstumsfaktor eingeben: "); 
		int wachstum = IO.readInteger();
		System.out.print("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
		int tage = IO.readInteger();

		int starttag;
		System.out.println("Tag || Zellenwert");

		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = starttag * Math.pow(wachstum, i); 	
			System.out.println(starttag  + "\t" + ergebnis );

		}


	}

}
