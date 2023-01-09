import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,m,i,j = 0,nlinha;
		double somalinha;
		
		
		
		System.out.println("Digite o tamanho da matriz");
		m = sc.nextInt();
		n = sc.nextInt();
		
		if(m<11 && n<11) {
		
		double [][] mat = new double [m][n];
		double [] vet = new double [m];
		
		nlinha = 0;
		for (i=0;i<m;i++) {
			
			nlinha = nlinha + 1;
			System.out.println("Digite os elementos da " + nlinha + "a. linha");
			
				for(j=0;j<m;j++) {
					mat[i][j] = sc.nextDouble();
					
				}}
				
		
		for(i=0;i<m;i++) {
			
			somalinha=0;
			
			for(j=0;j<n;j++) {
				somalinha = somalinha + mat [i][j];
			}
			vet [i] = somalinha;
		}
			
		System.out.println("Vetor Gerado: ");
		for(i=0;i<m;i++) {
			System.out.println(vet [i]);
		}
	
		sc.close();
		}
		
		else {
			System.out.println("Nenhum numero pode ser maior do que, 10! ");
		}
}}
