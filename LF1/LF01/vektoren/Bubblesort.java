package vektoren;

import oop.IO;

public class Bubblesort {

	public static void main(String[] args) {
		System.out.print("Wieviele zahlen wollen sie eingeben ? : ");
		int laengezahlen = IO.readInteger();

		double[] zahlen = new double[laengezahlen];

		for(int i = 0; i < laengezahlen; i++) {
			System.out.println("Gib die zahl ein: ");
			zahlen[i] = IO.readDouble();
		}


		for (int j = 0; j < laengezahlen + 1; j++) {


			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					double sum = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = sum;

				}

			}
		}


		System.out.println("Zahlen in aufsteigender Reihenfolge : ");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println( String.format("%.2f", zahlen[i]) + "; ");
		}
	}

}


