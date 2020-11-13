package scratch2Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Notenchema {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Geben sie bitte die Prozente ohne das Prozentzeichenein ");
		String eingabe = br.readLine();
		double prozent = Double.parseDouble(eingabe.trim().replace(',', '.'));
		
	
		
		
		if (prozent >= 85) {
			System.out.println("Note 1");
		}
		else if (prozent >=73) {
			System.out.println("Note 2");
		}
		else if (prozent >=59) {
			System.out.println("Note 3");

		}else if (prozent >=45) {						
			System.out.println("Note 4");				
		
		}else if (prozent >= 27) {
			System.out.println("Note 5");

		}else {
			System.out.println("Note 6");
		} 
				

		
	}	
			

} 
