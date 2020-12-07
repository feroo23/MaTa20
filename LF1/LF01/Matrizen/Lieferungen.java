package Matrizen;

import oop.IO;

public class Lieferungen {
	
	public static void main(String[] args) {
		System.out.print("Wie viele Artikel haben sie angeboten? ");
		int artikel = IO.readInteger();
		System.out.print("Wie viele Kunden haben sie, die Produkte gekauft haben? ");
		int kunden = IO.readInteger();
		
		int[][] matrix1 = new int[artikel][kunden];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print("Geben sie die Werte für Matrix 1 an der Stelle [" + i + "] [" + j + "] ein: ");
				matrix1[i][j] = IO.readInteger();

			}
			
		}
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");
			} 
			System.out.println("");
		}
		int[][] matrix2 = new int[artikel][kunden];
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print("Geben sie die Werte für Matrix 2 an der Stelle [" + i + "] [" + j + "] ein: ");
				matrix2[i][j] = IO.readInteger();
			}
		}
		System.out.println(" ");
		
		int[][] matrixsumme = new int[artikel][kunden];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrixsumme[i][j] = matrix1[i][j] + matrix2[i][j];
				
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Matrix 1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Matrix 2: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");
			}System.out.println("");
		}
		System.out.println("Matrixsumme: ");
		for (int i = 0; i < matrixsumme.length; i++) {
			System.out.print("\t Kunde " + i );
		}
		for (int i = 0; i < matrixsumme.length; i++) {
			for (int j = 0; j < matrixsumme[i].length; j++) {
				System.out.print(matrixsumme[i][j] + "\t\t");
			}System.out.println("");
		}		

	}
}

