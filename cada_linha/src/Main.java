import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i,j, maior;
		

		System.out.print("Qual a ordem da Matriz?");
		n = sc.nextInt();
		
		int [][]mat = new int [n][n];
		int[] maiorlinha = new int[n];
		
		for(i=0;i<n;i++) {
			for(j=1;j<n;j++) {
				
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		  for (i=0; i<n; i++) {
		        maior = mat[i][0];
		        for (j=0; j<n; j++) {
		            if (maior < mat[i][j]) {
		                maior = mat[i][j];
		            }
		        }
		        maiorlinha[i] = maior;
		    }
		
		  
		    System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		    for (i=0; i<n; i++) {
				System.out.printf("%d\n", maiorlinha[i]);
		    }
		
		
		sc.close();
		
	}

}
