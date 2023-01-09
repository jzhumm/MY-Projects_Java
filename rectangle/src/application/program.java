package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Metric;



public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Metric metric = new Metric();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.println("Width: ");
		metric.width = sc.nextDouble();
		System.out.println("Height: ");
		metric.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f", + metric.area());
		System.out.println();
		System.out.printf("Perimeter: %.2f", + metric.perimeter());
		System.out.println();
		System.out.printf("Diagonal: %.2f", + metric.diagonal());
		
		
		sc.close();

	}

}
