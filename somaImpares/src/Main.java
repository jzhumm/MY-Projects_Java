import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int x,y,i,troca,soma;
		
		System.out.println("Digite um número de 'Enter' em seguida mais um número e 'Enter': ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for(i = x+1; i<y; i++) {
			if(i % 2 !=0) {
				soma = soma + i;
			}
		}
		
		System.out.println("A soma dos impares = " + soma);
		
		sc.close();
	}

}
