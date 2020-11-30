package Matrizen;

import java.io.IOException;

import oop.IO;

public class Kino {

	public static void erzeugenSaal() throws IOException {
		System.out.println("Wie viele reihen soll der Saal haben");
		int rei = IO.readInteger();
		System.out.println("Wie viele sitze soll eine Reihe haben ");
		int platz = IO.readInteger();

		int[][] arr = new int [rei][platz];

		for (int i = 0; i < arr.length; i++) {
			i = 0;
			for (int j = 0; j < arr[i].length; j++) {
				j = 0;
				System.out.println(arr);

			}

		}







	}


}
