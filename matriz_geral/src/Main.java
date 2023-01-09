import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i,j,linha,coluna;
		double somap;
		
		
		System.out.println("Qual a ordem da Matriz?");
		n = sc.nextInt();
		
		double[][]mat = new double [n][n];
		double[]vet = new double [n];
		double[]diagon = new double [n];		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				System.out.print("Elemento ["+i+","+j+"]:");
				mat[i][j]=sc.nextDouble();
			}
		}
		
		System.out.println();
		somap =0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				if(mat[i][j]>0) {
					
					somap = somap + mat[i][j];
				}
				
			}
		}
		
		System.out.println("Soma positivos = " + somap);
		
		System.out.println();
		System.out.print("Escolha uma linha: ");
		linha=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				vet[j]=mat[linha][j];
				
			}
		}
		
		System.out.print("Linha escolhida: ");
		for(i=0;i<n;i++) {
	
			System.out.print(vet[i]+" ");
			
	}
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		coluna=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				vet[i]=mat[i][coluna];
				
			}
		}
		
		System.out.print("Coluna escolhida: ");
		for(i=0;i<n;i++) {
	
			System.out.print(vet[i]+" ");
			
	}
		
		System.out.println();
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j) {
				diagon[i]=mat[i][j];
				
			}
		}}
		
		System.out.println();
		System.out.print("Diagonal principal: ");
		for(i=0;i<n;i++) {
			
			System.out.print(diagon[i]+" ");
			
		}
	System.out.println();	
	System.out.println();
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			
			if(mat[i][j]<0) {
				
				mat[i][j] = Math.pow(mat[i][j], 2);
				
			}
				
	}}
	System.out.print("Matriz Alterada: ");
	System.out.println();
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	sc.close();
}}
