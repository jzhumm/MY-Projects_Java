import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int n,i,j,somadiag;
		
		System.out.println("Qual a ordem da Matriz? ");
		n = sc.nextInt();
		
		int[][]mat = new int[n][n];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		somadiag = 0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				if(i<j) {
					somadiag = somadiag + mat[i][j];
				}
			    
			}
		}
		
		System.out.println("A soma dos elementos acima da diagonal principal = " + somadiag);
		
		
		sc.close();

	}

}
