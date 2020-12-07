package Matrizen;

import java.io.IOException;
import oop.IO;

public class Kino {

	public static void main(String[] args) throws IOException {
		boolean ok = true;
		String [][] kino = erzeugeSaal();
		do {
			
			anzeigeSaal(kino);

			System.out.println(" ");
			System.out.println("==========================================================================================");
			System.out.println(" ");
			System.out.println("Was wollen sie tun? ");
			System.out.println("[R] für reservieren");
			System.out.println("[S] für stornieren");
			System.out.println("[E] für Benden ");
			String text = IO.readString();

			if (text.equalsIgnoreCase("r")){
				reserviereplatz(kino);
			}
			if (text.equalsIgnoreCase("s")) {
				storniereplatz(kino);
			}
			else if (text.equalsIgnoreCase("e")) {
				ok = false;
			}
			
		}while (ok == true );
		
	}

	public static String[][] erzeugeSaal(){
		System.out.println("Wie viele reihen soll der Saal haben");
		int rei = IO.readInteger();
		System.out.println("Wie viele sitze soll eine Reihe haben ");
		int platz = IO.readInteger();

		String [][] saal = new String [rei+1][platz+1];
		saal[0][0] = "\t";
		for (int j = 1; j < saal[0].length; j++) {
			saal[0][j] = "Platz" + j;

		}

		for (int i = 1; i < saal.length; i++) {		
			saal[i][0] = "Reihe " + i + " ";

		}

		for (int i = 1; i < saal.length; i++) {
			for (int j = 1; j < saal[i].length; j++) {
				saal[i][j] = "O";
			}
		}
		return saal;
	}
	public static void anzeigeSaal(String[][] saal){
		System.out.println("==========================================================================================");
		System.out.println(" ");

		for (int i = 0; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				System.out.print(saal[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void reserviereplatz(String[][] saal) {
		System.out.println(" ");
		System.out.println("in welcher Reihe möchten sie reservieren ");
		int reihe = IO.readInteger();
		System.out.println("Welchen Platz wollen sie in der Reihe " + reihe + " reservieren?");
		int platz = IO.readInteger();
		
		
		
		System.out.println(" ");
		if (saal[reihe][platz] == "O") {
			saal[reihe][platz] = "X";
		}
		else if (saal[reihe][platz] == "X") {
			System.out.println("Der platz ist schon belegt");                                    
		}
		anzeigeSaal(saal);

	}

	public static void storniereplatz(String[][] saal) {
		System.out.println(" ");
		System.out.print("In welcher Reihe wollen sie einen Platz Stornieren? = ");
		int reihe = IO.readInteger();
		System.out.println("");
		System.out.print("Welchen Platz wollen sie in Reihe " + reihe + " Stornieren? = ");
		int platz = IO.readInteger();
		System.out.println(" ");

		System.out.println(" ");
		if (saal[reihe][platz] == "X") {
			saal[reihe][platz] = "O";
		}else if (saal[reihe][platz] == "O") {
			System.out.println("Der platz ist nicht belegt");                                    
		}
		anzeigeSaal(saal);

	}

}


