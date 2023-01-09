import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.println("Digite 3  números");
		System.out.print("Primeiro número: ");
		a = sc.nextInt();
		System.out.print("Segundo número: ");
		b = sc.nextInt();
		System.out.print("Terceiro número: ");
		c = sc.nextInt();
		
		if( a<b && a<c ) {
			menor = a;
		}
		else if(b<c) {
			menor = b;
		}
		else {
			menor = c;
		}
		
		System.out.println("MENOR: " + menor);

	}}
