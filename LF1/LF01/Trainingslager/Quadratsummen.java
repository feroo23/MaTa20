package Trainingslager;

import java.io.IOException;

import oop.IO;

public class Quadratsummen {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie den Anfangswert ein: ");
		int awert = IO.readInteger();
		System.out.print("geben sie den Endwert ein: ");
		int ewert = IO.readInteger();
		for (int i = awert ; i <= ewert ; i++){ 	
			System.out.print(i +"= " );
			System.out.println(Math.sqrt(i));	
	}

	}
}
