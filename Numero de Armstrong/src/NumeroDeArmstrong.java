import java.util.Locale;
import java.util.Scanner;

class NumeroDeArmstrong
 {
   public static void main(String args[]){
	   
	   //1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 
	   //93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 
	   //146511208, 472335975,534494836, 912985153, 4679307774, 32164049650, 32164049651
	   
      int n, sum = 0, temp, r;
      
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Informe um número: ");      
      n = sc.nextInt();
 
      temp = n;
 
      while( temp != 0 )
      {
         r = temp%10;
         sum = sum + r*r*r;
         temp = temp/10; 
      }
 
      if ( n == sum )
         System.out.println("O número informado é um número armstrong.");
      else
         System.out.println("O número informado não é um número armstrong.");         
   }
 }
