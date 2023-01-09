package main;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("What is the dollar price? ");
		double value = sc.nextDouble();
			
		System.out.println("How many dollars will be bought? ");
		double manyD = sc.nextDouble();
		
		
		
		double reais = (value * manyD) + ( value * manyD * 6/100);
		
		
		
		System.out.println("Amount to be paid in reais? " + reais );
			
		;

	}

}
