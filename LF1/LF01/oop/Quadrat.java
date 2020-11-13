package oop;

import java.io.IOException;

public class Quadrat {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie groﬂ soll das Quadrat sein? ");
		int anz = IO.readInteger();
		for (int i = 1; i <= anz; i ++) {
			if (i == 1) {
				for (int j = 1; j <=anz; j++) {
					System.out.print("*");
					
				}
				System.out.println(" ");
			} else if (i == anz) {
				for (int j = 1; j <=anz; j++) {
					System.out.print("*");
					
				}
				System.out.println(" ");
			} else {
				for (int j = 1; j <= anz; j++) {
					if (j == 1) {
						System.out.print("*");
					} else if (j == anz) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
			
		
		}
		
	}

}
