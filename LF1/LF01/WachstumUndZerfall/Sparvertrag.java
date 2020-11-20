package WachstumUndZerfall;

import java.io.IOException;

import oop.IO;

public class Sparvertrag {

	public static void main(String[] args) throws IOException {
		System.out.print("Bitte geben sie ihr Kapital ein: ");
		double kapital = IO.readDouble();
		System.out.print("Bitte den Zinsatz eingeben: ");
		double zins = IO.readDouble();
		System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
		double jahr = IO.readDouble();
		System.out.println("Jahr \t Anfangskapital \t\t Zinsbetrag \t Jahresbetrag");


		for (int i = 1; i <= jahr; i++) {
			double zbetrag = kapital /100 * zins ;
			zbetrag = zbetrag = Math.round(100.0 * zbetrag) / 100.0;
			double jbetrag = kapital + zbetrag;
			jbetrag = jbetrag = Math.round(100.0 * jbetrag) / 100.0;

			System.out.println(i + "\t" + kapital + "\t\t\t\t" + zbetrag + "\t\t" + jbetrag );
			kapital = kapital + zbetrag;
			kapital = kapital = Math.round(100.0 * kapital) / 100.0;
		}
	}

}
