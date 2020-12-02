package Matrizen;

import oop.IO;

public class Lieferungen {

	public static void main(String[] args) {
		//1
		erzeugefeld();
		String[][] feld1 = erzeugefeld();
		eingabeWert();
		anzeigefeld(feld1);

		//2	
		System.out.println("Martrix ");
		erzeugefeld();
		String[][] feld2 = erzeugefeld();
		anzeigefeld(feld2);
		eingabeWert();
	}

	private static String[][] erzeugefeld(){
		String [][] ar = new String [5][4];
		ar[0][0] = "\t";
		for (int j = 1; j < ar[0].length; j++) {
			ar[0][j] = "Kunde" + j;

		}

		for (int i = 1; i < ar.length; i++) {		
			ar[i][0] = "artiklel " + i + " ";

		}

		for (int i = 1; i < ar.length; i++) {
			for (int j = 1; j < ar[i].length; j++) {
				ar[i][j] = "-";
			}
		}
		return ar;

	}
	private static void anzeigefeld(String[][] ar){
		System.out.println("==========================================================================================");
		System.out.println(" ");

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	private static void anzeigsum(){
		

	}
	private static void eingabeWert(){


	}

}

