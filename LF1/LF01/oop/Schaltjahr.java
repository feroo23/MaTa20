package oop;

import java.io.IOException;

public class Schaltjahr {

	public static void main(String[] args) throws IOException {
		System.out.print("bei welchem jahr soll die Berechnung straten?");
		int anfangj = IO.readInteger();
		System.out.print("bis zu welchem jahr soll Berechnent werden? ");
		int endej = IO.readInteger();
		for (int jahr = anfangj; jahr <= endej; jahr++) {

			boolean Schaltjahr = jahr % 4 == 0;
			boolean Keinschaltjahr = jahr % 100 == 0;
			boolean ausnahme = jahr % 400 == 0;

			if (Schaltjahr) {
				System.out.println(jahr + " Es ist ein Schaltjahr");
			}else if (Keinschaltjahr) {
				if (ausnahme) {
					System.out.println(jahr + " Es ist ein Schaltjahr");
				}else { 
					System.out.println(jahr + " Das Jahr ist kein schaltjahr");
				}
			}
		}

	}

}
