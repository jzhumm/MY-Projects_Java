import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
	
		System.out.println("Dados da segunda pessoa: ");		
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2) / 2.0;
		
		System.out.println("A idade média entre " + nome1 + " e " + nome2 + " é de " + media + " anos");

		
		
		sc.close();
	}

}
