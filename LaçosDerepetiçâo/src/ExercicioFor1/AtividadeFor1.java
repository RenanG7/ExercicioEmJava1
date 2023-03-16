package ExercicioFor1;

import java.util.Scanner;

public class AtividadeFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1, par = 0, Impar = 0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1; x <=10; x++)
		{
		 System.out.println("\nDigite um numero: " );
	     Num1 = leia.nextInt();
		  if (Num1 % 2 == 0) { 
			par++;
		  }else
		  {
			  Impar++;
		  }
		}System.out.println("\nA quantidade de números pares é " +par);	
		 System.out.println("\nA quantidade de números impar é " +Impar);	
		
		
	}

}
