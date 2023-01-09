package pi;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		
		double v = Calculator.volume(radius);
		
		
		System.out.printf("Circumference %.2f", c);
		System.out.println();
		System.out.printf("Volume %.2f", v);
		System.out.println();
		System.out.printf("PI value %.2f", Calculator.PI);
		
		sc.close();
		

	}
	
	}