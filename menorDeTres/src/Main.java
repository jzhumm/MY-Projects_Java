import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.println("Digite 3  n�meros");
		System.out.print("Primeiro n�mero: ");
		a = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		b = sc.nextInt();
		System.out.print("Terceiro n�mero: ");
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
