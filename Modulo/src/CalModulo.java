import java.util.Locale;
import java.util.Scanner;

public class CalModulo {

	public static void main(String[] args) {

	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, div, res;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		System.out.println("Digite o número divisor");
		div = sc.nextInt();
		
		res = num%div;
		
		System.out.println("O modulo de " + num + " é " + res);

	}

}
