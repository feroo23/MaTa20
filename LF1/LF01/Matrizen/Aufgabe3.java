package Matrizen;

import java.io.IOException;

import oop.IO;

public class Aufgabe3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie Groﬂ soll der sall in der breite sein ? ");
		int spalten = IO.readInteger();
		System.out.println("Wie groﬂ soll der sall in der l‰nge sein ? ");
		int zeilen = IO.readInteger();
		
		String[][] zweid = new String[zeilen][spalten];
		
		for (int i = 0; i < zweid.length; i++) {
			
			for (int j = 0; j < zweid[i].length; j++) {
				System.out.print("Geben Sie den Wert f¸r zweid[" +i+ "][" +j+ "]: ");
				zweid[i][j] = IO.readString();
			}
		}
		for (int i = 0; i < zweid.length; i++) {
			
			for (int j = 0; j < zweid[i].length; j++) {
				System.out.print(zweid[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}
