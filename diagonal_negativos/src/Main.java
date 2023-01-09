import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i,j,cont;
		
		System.out.println("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		if(n<11) {
			
			int [][] mat = new int [n][n];
			
			for(i=0; i<n; i++) {
			
				for(j=0; j<n; j++) {
					
				System.out.print("Elemento [ " + i + "," + j + "]:" );
				mat[i][j] = sc.nextInt();
					
				}
			}
			
			System.out.println("Diagonal principal: ");
			for(i=0;i<n;i++) {
				
				System.out.print(mat[i][i] + " ");
			}
			
			System.out.println();
			cont = 0;
		
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					if(mat[i][j]<0) {
						cont++;
					}
				}
			}
			
			System.out.println("Quantidade de negativos: " + cont);
			
	sc.close();
		
		}
		
		else {
			System.out.print("Numero maximo de dez!");
		}
		
		
	}

}
