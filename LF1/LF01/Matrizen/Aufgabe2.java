package Matrizen;

import oop.IO;

public class Aufgabe2 {

	public static void main(String[] args) {
		System.out.println("Wie viele Spalten erfast werden? ");
		int spalten = IO.readInteger();
		System.out.println("Wie viele Zeilen erfast werden? ");
		int zeilen = IO.readInteger();

		double[][] zweid = new double[zeilen][spalten];

		// Eingabe
		for (int i = 0; i < zweid.length; i++) {

			for (int j = 0; j < zweid[i].length; j++) {
				System.out.print("Geben Sie den Wert für zweid[" +i+ "][" +j+ "]: ");
				zweid[i][j] = IO.readInteger();
			}

		}

		// Ausgabe
		for (int i = 0; i < zweid.length; i++) {

			for (int j = 0; j < zweid[i].length; j++) {
				System.out.print(zweid[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
