package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p,areaX,areaY;
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.println();
		System.out.printf("Triangle X area: %.4f ", + areaX);
		System.out.println();
		System.out.printf("Traingle Y area: %.4f", + areaY);
		System.out.println();
		
		if(areaX>areaY) {
			
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}		
		
		sc.close();

	}

}
