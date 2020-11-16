package oop;

import java.io.IOException;

public class Summen {

	public static void main(String[] args) throws IOException {
		

		System.out.println("Wie viele Zahlen sollen erfassst werden? ");
		int anzGerade = 0, sumGerade = 0, anzunGerade = 0, sumunGerade = 0;
		int a[] = IO.readIntegerArray1D();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				anzGerade = anzGerade + 1;
				sumGerade = sumGerade + a[i];
			}
			else {
				anzunGerade = anzunGerade + 1;
				sumunGerade = sumunGerade + a[i];
			}
		}	
		System.out.println("gerade zahlen:");
		System.out.println("Anzahl = " + anzGerade);
		System.out.println("Summe = " + sumGerade);
		System.out.println("Ungerade Zahlen: ");
		System.out.println("Anzahl = " + anzunGerade);
		System.out.println("Summe = " + sumunGerade);
	}

}
