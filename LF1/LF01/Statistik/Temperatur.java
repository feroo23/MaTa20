package Statistik;

import java.io.IOException;

import oop.IO;

public class Temperatur {

	public static void main(String[] args) throws IOException {
		System.out.print("Wie viele Werte sollen erfasst werden: ");
		int anzahl = IO.readInteger();

		double [] tage = new double [anzahl];
		double summe = 0;
		double max;
		double min;
		for (int i = 0; i < tage.length; i++) {
			System.out.print("Bitte geben sie die Temperatur an tag " + (i + 1) +": ");
			tage [i] = IO.readDouble();
			summe += tage [i];
		}

		max = tage[0];
		for (int i = 1; i < tage.length; i++) {
			if (max < tage[i]) {
				max = tage[i];
			}
		}

		min = tage [0];
		for (int i = 1; i < tage.length; i++) {
			if (min > tage[i]) {
				min = tage[i];
			}
		}

		double mittelwert = summe / tage.length;
		mittelwert = Math.round(100.0 * mittelwert) / 100.0;
		System.out.println("Der durchschnitt beträgt " + mittelwert + "°C");
		System.out.println("Das Maximum beträgt: " + max + "°C");
		System.out.println("Das minimum beträgt: " + min + "°C");
	}
}
