package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Final grade: %.2f", + student.finalGrade());
		
		if(student.finalGrade()<60.0) {
			System.out.println();
			System.out.println("Failed");
			System.out.printf("Missing Points: %.2f", + student.missingPoints());
		}
		else { 
			System.out.println();
			System.out.println("PASS!");
		}
		sc.close();

	}

}
