package oop;

import java.io.IOException;

public class BMI {

	public static void main(String[] args) throws IOException {

		System.out.print("Geben sie [M] für männlich und [W] für weiblich ein ");
		String mw = IO.readString();
		System.out.print("Gib deine köper größe in cm ein ");
		double cm = IO.readDouble();
		System.out.print("Gib dein gewicht in kg an ");
		double kg = IO.readDouble();

		double bmi = kg / ((cm / 100) * (cm/100));

		if (mw.equalsIgnoreCase("w")) {		
			frau(bmi);
		}else if (mw.equalsIgnoreCase("m")) {
			mann(bmi);
		}


	}


	private static void frau(double bmi) {
		if (bmi < 19 ) {
			System.out.print("Sie sind untergewichtig");
		} else if (bmi < 24) {
			System.out.print("Sie sind normalgewichtig");
		}else if (bmi < 30) {
			System.out.print("Sie sind übergewichtig");
		}else if (bmi < 40) {
			System.out.print("sie sind Adipositas");
		}else if (bmi <=40) {
			System.out.print("Sie sind Starke Adipositas");
		}

	}



	private static void mann(double bmi) {
		if (bmi < 20 ) {
			System.out.print("Sie sind untergewichtig");
		} else if (bmi < 25) {
			System.out.print("Sie sind normalgewichtig");
		}else if (bmi < 30) {
			System.out.print("Sie sind übergewichtig");
		}else if (bmi < 40) {
			System.out.print("sie sind Adipositas");
		}else if (bmi <=40) {
			System.out.print("Sie sind Starke Adipositas");
		}

	}



}