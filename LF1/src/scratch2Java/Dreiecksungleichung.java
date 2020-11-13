package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print ("Geben sie die Seite a ein ");
		String eingabe = br.readLine();
		double a = Double.parseDouble(eingabe.trim().replace(',', '.'));

		System.out.print("Geben sie die Seite b ein " );
		eingabe = br.readLine();
		double b = Double.parseDouble(eingabe.trim().replace(',', '.'));

		System.out.print("geben sie c die Seite ein ");
		eingabe = br.readLine();
		double c = Double.parseDouble(eingabe.trim().replace(',', '.'));

		double summe1 = a + b;
		double summe2 = b + c;
		double summe3 = c + a;

		if (summe1 <= c) {
			System.out.println("Dreieck Nicht Möglich");
			return;
		}
		if (summe2 <=a){
			System.out.println("Dreieck nicht Möglich");
			return;
		}
		if (summe3 <=b) {
			System.out.println("Dreieck nicht Möglich");
			return;
		}

		System.out.println("Dreieck ist Möglich" );

		double umfang = a+b+c;
		double s = umfang /2;
		double flach = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Fläche = " + flach);
		System.out.println("Umfang = " + umfang);
	}

}
