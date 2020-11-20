package vektoren;

public class Tonsignal {

	public static void main(String[] args) {
		int[] signal = { 1,5,4,5,7,6,8,6,5,4,5,4 };
		int [] geglaettete = new int[signal.length];
		
		geglaettete[0] = (signal[0] + signal[1]) / 2 ;
		geglaettete[signal.length-1] = (signal[signal.length-2] + signal[signal.length-1]) / 2;
		
		
		for (int i = 1; i < geglaettete.length-1; i++) {
			geglaettete[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
		}
		System.out.println("");
		
		for (int i = 0; i < geglaettete.length; i++) {
			System.out.print(signal[i]);
		}
		System.out.println();
		for (int i = 0; i < geglaettete.length; i++) {
			System.out.print(geglaettete[i]);
		}
	}

}
