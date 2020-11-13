package oop;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws IOException {
		boolean weiter;
		do {
			System.out.print("Wie heißt du? ");
			String name = IO.readString();
			System.out.println("Hallo " + name);
			System.out.print("Wie alt bist du ? ");
			int alter = IO.readInteger();
//			System.out.println("Du bist " +  alter +" Jahre alt ");
			System.out.println(name +" ist " + alter + " Jahre alt ");
			System.out.println("Möchten sie den vorgang wiederholen? ");
			weiter = IO.readBoolean();
		}while(weiter == true);
	}


}	
