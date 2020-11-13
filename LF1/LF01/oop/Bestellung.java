package oop;

import java.io.IOException;

public class Bestellung {

	public static void main(String[] args) throws IOException {
		System.out.print("Wie viele Schrauben wollen sie kaufen? ");
		double aSchrauben = IO.readDouble();
		System.out.print("Wie viele Muttern wollen sie kaufen? ");
		double aMuttern = IO.readDouble();
		System.out.print("Wie viele Unterlegscheiben wollen sie kaufen? ");
		double aUnterlegscheiben = IO.readDouble();
		double preis = aSchrauben * 0.05 + aMuttern * 0.05 + aUnterlegscheiben * 0.01;
		System.out.print("Die bestellung kostet " + preis + "€. ");
		if (aSchrauben == aMuttern && aSchrauben == aUnterlegscheiben ) {
			System.out.print("Die Bestellung ist ok.");
		}else { 
			System.out.print("Sie wollten Die Bestellung nochmal überprüfen!");
		}
		
		
		
	}
}
