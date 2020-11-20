package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	/**
	 * Liest einen Text  von der Konsole
	 * @return
	 * @throws IOException
	 */

	public static String readString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eingabe = br.readLine();
		return eingabe;

	}
	
	public static int readInteger() throws IOException {
		while (true) {
			try {
				String eingabe = readString();
				int zahl = Integer.parseInt(eingabe);
				return  zahl; 	
			}
			catch (NumberFormatException e) {
				System.out.println("keine Ganzzahl! Bitte erneut versuchen: ");

			}

		}

	}
	
	/**
	 * Liest eine Kommazahl von der Konsole ein 
	 * @return Eine Komma zahl 
	 * @throws IOException
	 */
	public static double readDouble() throws IOException {
		while (true) {
			try {
				String eingabe = readString();
				double zahl = Double.parseDouble(eingabe.trim().replace(',', '.'));

				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.println("keine Ganzzahl! Bitte erneut versuchen: ");

			}
		}
	}
	public static boolean readBoolean() throws IOException {
		while (true) {
			String eingabe = readString();
			if (eingabe != null ) {	
				if ((eingabe.equalsIgnoreCase("ja"))
						|| (eingabe.equalsIgnoreCase("j"))
						|| (eingabe.equalsIgnoreCase("yes"))
						|| (eingabe.equalsIgnoreCase("yes"))){
					return true;
				} else if ((eingabe.equalsIgnoreCase("nein"))
						|| (eingabe.equalsIgnoreCase("n"))
						|| (eingabe.equalsIgnoreCase("no"))
						|| (eingabe.equalsIgnoreCase("nö"))){
					System.out.println("Programm wurde beendet! ");
					return false;
				} else {
					System.out.print("Ungültige Eingabe! Bitte erneut versuchen: ");
				}

			}
		}
	}
	/**
	 * Liest ein eindiemensionales Array von Ganzzahlen von der Konsole ein.
	 * @param array Das füllende Array.
	 * @return Ein eindiemensionales Array.
	 * @throws IOException
	 */
	public static int [] readIntegerArray1D(int[]array) throws IOException {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Wert eingeben für [" + i +"]: ");
			array[i] = IO.readInteger();
		}
		return array;
	}
	/**
	 * Liest ein eindiemensionales Array von Ganzzahlen von der Konsole ein.
	 * @param anzahlWerte Die Anzahl der Array elemente.
	 * @return ein eindiemensionales Array.
	 * @throws IOException
	 */
	public static int [] readIntegerArray1D(int anzahlWerte) throws IOException {
		int[] array = new int[anzahlWerte];
		array = readIntegerArray1D();
		return array;
	}


	/**
	 * Liest ein eindiemensionales Array von Ganzzahlen von der Konsole ein.
	 * @param array Das zu füllendes array
	 * @return Ein eindiemensionales Array
	 * @throws IOException
	 */
	public static int [] readIntegerArray1D() throws IOException {
		System.out.print("Wie viele werte? ");
		int zeilen = IO.readInteger();
		int[] array = readIntegerArray1D(zeilen);
		return array;
	}
	/**
	 * Liest ein eindiemensionales Array von Kommmazahlen von der Konsole ein.
	 * @param array
	 * @return
	 * @throws IOException
	 */
	public static double[] readDoubleArray1A(double[] array) throws IOException {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Wert eingeben für [" + i +"]: ");
			array[i] = readDouble();
		}
		return array;	
	}

	public static double[] readDoubleArray1A() throws IOException {
		System.out.print("Wie viele Werte? ");
		int zeilen = readInteger();
		double[] array = readDoubleArray1A(zeilen);
		return array;
	}

	public static double[] readDoubleArray1A(int anzWert) throws IOException {
		double[] array = new double[anzWert];
		array = readDoubleArray1A(array);
		return array;
	}

}
