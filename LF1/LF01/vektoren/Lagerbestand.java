package vektoren;

import java.io.IOException;
import java.text.DecimalFormat;

import oop.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {
		System.out.print("wie viele verschiende artikel haben sie im Lager?: ");
		int anz = IO.readInteger();

		int[] aznz = new int[anz];
		String[] name = new String[anz];
		double[] preis = new double[anz];

		for (int i = 0; i < anz; i++) {
			System.out.println("Geben sie den name des artikel ein: ");
			name[i] = IO.readString();

			System.out.println("Geben sie die anzhal ein: ");
			aznz[i] = IO.readInteger();

			System.out.println("geben sie den Preis ein: ");
			preis[i] = IO.readDouble();
		}
		
		int merken = 0;
		double prgesamt = 0;
			
		for (int i = 0; i < anz; i++) {
			merken += aznz[i];
			prgesamt += aznz[i] * preis[i];  
		}
		
		DecimalFormat df = new DecimalFormat(); 
		df.applyLocalizedPattern("###.###,00");
		
		System.out.println("es sind " + merken + " und kostet " + df.format(prgesamt) + "€");
		
	}
	
}
