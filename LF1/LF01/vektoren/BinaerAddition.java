package vektoren;

import java.io.IOException;

import oop.IO;

public class BinaerAddition {



	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Stellen haben die Binärzahlen maximal?");
		int binLength = IO.readInteger();

		System.out.println("Gib die erste Zahl ziffernweise von links ein");
		int[] bin1 = createBinArr(binLength);

		System.out.println("Gib die Zweite Zahl ziffernweise von links ein");
		int[] bin2 = createBinArr(binLength);

		int[] addArr = new int[bin1.length];
		boolean uebertrag = false;

		for(int i = bin1.length - 1; i >= 0; i--){
			if(uebertrag){
				uebertrag = false;
				if(bin1[i] == 0){
					bin1[i] = 1; 
				}
				else if(bin2[i] == 0){
					bin2[i] = 1;
				}
				else{
					uebertrag = true;
				}
			}


			if(bin1[i] == 0 && bin2[i] == 0){
				addArr[i] = 0;
			}
			if(bin1[i] == 1 && bin2[i] == 0 || bin1[i] == 0 && bin2[i] == 1){
				addArr[i] = 1;
			}
			if(bin1[i] == 1 && bin2[i] == 1){
				addArr[i] = 0;
				uebertrag = true;
			}
		}

		System.out.print("Ergebnis: ");
		for(int i: addArr){
			System.out.print(i);
		}
	}
	private static int[] createBinArr(int arrLength) throws IOException{
		arrLength++;
		int[] binArr = new int[arrLength];

		for (int i = arrLength - 1; i >= 0; i--) {
			if (i == 0) {
				binArr[i] = 0;
			} else {
				binArr[i] = IO.readInteger();
			}
		}

		return binArr;
	}
}
