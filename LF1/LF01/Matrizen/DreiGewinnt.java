package Matrizen;

import oop.IO;

public class DreiGewinnt {

	public static void main(String[] args) {
		erzeugespielfeld();

	}
	public static String[][] erzeugespielfeld(){
		System.out.println("Wie groﬂ solll das spielfeld sein? ");
		int gr = IO.readInteger();
		
		String[][] feld = new String [gr +1 ][gr + 1];
		feld [0][0] = "\t";
		
		for (int i = 1; i < feld.length; i++) {
			for (int j = 1; j < feld[i].length; j++) {
				feld[i][j] = "-";
			}
		}
		
		
		return feld;
		
	}

}
