package camadaCondicional_if;

import java.util.Scanner;

public class Condicional_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1;
		int res;
		
		System.out.println("\nDigite um valor: ");
		Scanner leia = new Scanner(System.in);
        N1 = leia.nextInt();
        
        res = (N1 % 2 );
        
        if(res == 0 && N1 > 0){
        	System.out.println("\nO numero " + N1 + " é par e maior que 0 ");
        }
        else if( res == 0 && N1 < 0) {
            System.out.println("\nO numero "+  N1 + " é par e menor que 0 ");
        }
        else if( res != 0 && N1 < 0) {
        	System.out.println("\nO numero "+  N1 + " é impar e menor que 0 ");        	
        }
        else if( res != 0 && N1 > 0) {
        	System.out.println("\nO numero "+  N1 + " é impar e maior que 0 ");
        } 
        else {
        	System.out.println("\nO numero é igual a zero: ");
        }
	}

}
