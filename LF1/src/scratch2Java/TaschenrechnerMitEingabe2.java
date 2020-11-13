package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe2 {

	private static double x;
	private static double y;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static String eingabe;



	public static void main(String[] args) throws IOException {	


		boolean weiter = true;
		do
		{
			schreibeMenue();


			if (eingabe.equals("+")){
				addieren();
			}
			else if (eingabe.equals("-")) {
				subtrakation();

			}
			else if (eingabe.equals("*")){
				multiplizieren();
			}
			else if  (eingabe.equals("/")) {
				division();
			}
			else if  (eingabe.equals("p")) {
				potenziern();
			}
			else if (eingabe.equalsIgnoreCase("W")) {
				wurzel();
			}	
			System.out.println("soll das Programm wiederholt werden?");
			String text = br.readLine().trim();

			if (text.equalsIgnoreCase("ja")){
				weiter = true;
			}else 
			{
				weiter = false;
			}
		}while (weiter == true);


	}


	private static void wurzel() throws IOException {
		
		double wurzel = Math.sqrt(x);
		System.out.println("wurzel (W) = " + wurzel);

	}

	private static void potenziern() {
		double potenziern;
		potenziern = Math.pow(x, y);
		System.out.println("potenziern (p)" + potenziern);		
	}

	private static void division() {
		double division;
		division = x / y;
		System.out.println("Division (÷) = " + division);		
	}

	private static void multiplizieren() {
		double multiplizieren ;
		multiplizieren= x * y;
		System.out.println("Multipliezieren(×) = " + multiplizieren);		
	}

	private static void subtrakation() {
		double subtrakation;
		subtrakation = x - y;	
		System.out.println("subtrakation (-) = " + subtrakation);
	}
	
	private static void addieren() throws NumberFormatException, IOException {
		
		double addition;
		addition = x + y;
		System.out.println("Addition (+) = " + addition );
	}
	
	private static void schreibeMenue() throws IOException {
		System.out.println("Folgende rechenoperationen stehen zur auswahl");
		System.out.println("[+] für Addition");
		System.out.println("[-] für subtrakation");
		System.out.println("[*] für multiplikation");
		System.out.println("[/] für Division");
		System.out.println("[P] für Potenziern");
		System.out.println("[W] für Wurzel");
		System.out.print("Deine Auswahl: ");
		eingabe =br.readLine();
		if (eingabe.equalsIgnoreCase("w")) {
			System.out.println("Bitte geben Sie die Zahl ein: ");
			x = Double.parseDouble(br.readLine());
			
		} else {
			System.out.println("Bitte geben Sie die erste Zahl ein: ");
			x = Double.parseDouble(br.readLine());
			System.out.println("Bitte geben Sie die zweite Zahl ein: ");
			y = Double.parseDouble(br.readLine());
		}

	}


}