package camadaCondicional_if;

import java.util.Scanner;

public class Condicional_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3 ;
		int res;
		
		System.out.println("\nDigite um valor: ");
		Scanner leia = new Scanner(System.in);
		n1 = leia.nextInt();
		
		System.out.println("\nDigite outro valor: ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite outro valor: ");
		n3 = leia.nextInt();
		 
		res = (n1 + n2);
		
		if( res > n3){
			System.out.println("\nA soma "+n1+ "+" +n2+ "é maior que " +n3);
		}
		else if( res < n3){
			System.out.println("\nA soma "+n1+ "+" +n2+ "é menor que " +n3);	
		}
		
		else if( res == n3){
			System.out.println("\nA soma "+n1+ "+" +n2+ "é igual a " +n3);
			
		}
		
		
		
		
		

	}

}
