package vektoren;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		ohnezurueck();
		mitzurueck();

	}

	public static void ohnezurueck() {
		int[] lotto = new int[7];
		boolean wahl = false;
		System.out.println("die gezogenen Lottozahlen + Zusatzzahl sind: (ohne zurücklegen)");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 49);

			while(lotto[i] == 0 || lotto[i] > 49 || wahl == false){
				lotto[i] = (int) (Math.random() * 49);
				if(lotto[i] != 0 || lotto[i] <= 49) {
					wahl = true;
				}
			} 
		}
		sortieren(lotto);
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.print(lotto[i] + ", ");
		}


		lotto[6] = (int) (Math.random() * 49);
		System.out.println("");
		System.out.println(lotto[6]);
	}

	private static int[] sortieren(int[] lotto) {
		for (int j = 0; j < lotto.length - 1; j++) {

			for (int i2 = 0; i2 < lotto.length - 1; i2++) {
				if (lotto[i2] > lotto[i2 + 1]) {
					int c = lotto[i2];
					lotto[i2] = lotto[i2 + 1];
					lotto[i2 + 1] = c;
				}

			}
		}
		return lotto;
	} 

	public static void mitzurueck() {
	        int[] zufallszahl = new int[6];
	        System.out.println("Die zufalls Zahlen sind:");

	        for (int i = 0; i < 6; i++) {
	            zufallszahl[i] = (int)(Math.random() * 48) + 1;
	            for (int j = 0; j < 6; j++) {
	                if (zufallszahl[i] == zufallszahl[j]) {
	                    if (i != j) {
	                        i = 0;
	                    }
	                }
	            }
	        }

	        for (int i = 0; i < 6; i++) {
	            System.out.print(zufallszahl[i] + ", ");
	        }

	        double zufallszahl2 = 0;

	        for (int i = 0; i < 1; i++) {
	            zufallszahl2 = (int)(Math.random() * 48) + 1;
	            System.out.println("\nDie Extrazahl ist " + zufallszahl2);
	        }

	        Arrays.sort(zufallszahl);

	        System.out.println("\nDie Zahlen sortiert sind:");

	        for (int i = 0; i < zufallszahl.length; i++) {

	            System.out.print(zufallszahl[i] + ", ");

	        }

	        System.out.println("\nDie Extrazahl ist " + zufallszahl2 + "");



	    }



	}