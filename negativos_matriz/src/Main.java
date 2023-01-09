import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m,n,i,j;
		
		System.out.println("Digite o tamanho da matriz");
		m = sc.nextInt();
		n = sc.nextInt();
		
		if(m<11 && n<11) {
		
		int [][] mat = new int [m][n];
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
			
				if(mat [i][j]<0) {
					
					System.out.println("Valores negativos: " + mat[i][j]);
					
				}
				
			}
		}
		
		sc.close();
		}
		else {
			System.out.println("Nenhum numero pode ser maior do que, 10! ");
		}
		
		

	
		
}}
