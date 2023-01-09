import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int a,b,i;
		
		System.out.println("Digite dois números!");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while(a != b) {
		
		
		if (a>b) {
			System.out.println("Crescente!");
		}
		else {
			System.out.println("Decrescente!");
		}
		
		System.out.println("Digite outros dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		}	
		
	System.out.println("Numeros iguais, 'INVALIDO'");
sc.close();
}}
