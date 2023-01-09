import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		double soma, media;
		
		System.out.println("Quantos numeros voçe vai digitar? ");
		n = sc.nextInt();
		
		double [] vet = new double [n];
		
		for(i=0; i<n; i++) {
		
		System.out.print("Digite um numero: ");
		vet [i] = sc.nextDouble();
		
		}
		System.out.println();
		System.out.print("Valores: ");
		
		for(i=0; i<n; i++) {
			
			System.out.print(String.format("%.1f ", vet[i]));
			
					}
		soma = 0;
		for(i=0; i<n; i++) {
			
			soma = soma + vet[i];
		}
		
		System.out.println();
		System.out.print("Soma: " + String.format("%.2f", soma));
		
		media = 0;
		media = soma / n;
		System.out.println();
		System.out.print("Média: " + media);
		
		
		
	
				sc.close();
	

	}}
