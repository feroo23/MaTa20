package Trainingslager;

import java.io.IOException;

import oop.IO;

public class Fakultaet {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie die erste Zahl ein: ");
		int anfang = IO.readInteger();
		System.out.println("Geben sie die zweite zahl ein: ");
		int ende = IO.readInteger();
		for (int i = anfang ; i <= ende ; i ++) {
			System.out.println(i * i ); 
		
			
		}
		
	}

}
