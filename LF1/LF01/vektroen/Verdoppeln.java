package vektroen;

import java.io.IOException;

import oop.IO;

public class Verdoppeln {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
		double [] zahlen = IO.readDoubleArray1A();
		double max1;
		double max2;
		if (zahlen [0] > zahlen [1]) {
			max1 = zahlen[0];
			max2 = zahlen[1];
		}
		else {
			max1 = zahlen[1];
			max2 = zahlen[0];
		}
		for (int i = 2; i < zahlen.length; i++) {
			if (zahlen[i] > max1) {
				max2 = max1;
				max1 = zahlen[i];
			}
			else if (zahlen[i] > max2) {
				max2 = zahlen[i];
			}

		}
		System.out.println("Größte zahl: " + max1);
		System.out.println("Zweitgröste Zahl: " + max2);

	}

}
