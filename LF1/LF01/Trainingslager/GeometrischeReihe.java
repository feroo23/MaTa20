package Trainingslager;

import java.io.IOException;

import oop.IO;

public class GeometrischeReihe {

	public static void main(String[] args) throws IOException {
		System.out.println("bitte geben sie eine zahl ein");
		int wert = IO.readInteger();
		double summe = 0;
		double ergebniss = 0;
		for (int i = 0; i <= wert; i++) {
			summe = 1 / Math.pow(2, i);
			ergebniss = ergebniss + summe;
		}
		System.out.println(ergebniss);


	}

}
