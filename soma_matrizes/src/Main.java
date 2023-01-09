import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, m, i ,j;
		
		System.out.println("Quantas linhas vai ter cada matriz?");
			m = sc.nextInt();
		System.out.println("Quantas colunas vai ter cada matriz?");
			n = sc.nextInt();
		
		int [][]matA = new int[m][n];
		int [][]matB = new int[m][n];	
		int [][]matsoma = new int[m][n];

		System.out.print("Digite os valores da matriz A: ");
		System.out.println();
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
		
				System.out.print("Elemento ["+i+","+j+"]: ");
				matA[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				
				System.out.print("Elemento ["+i+","+j+"]: ");
				matB[i][j] = sc.nextInt();
				
			}
		}
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				
				matsoma [i][j] = matA [i][j] + matB [i][j];				
			}
		}
		
		System.out.println("Matriz soma: ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				
				System.out.print(matsoma [i][j] +" ");
								
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
