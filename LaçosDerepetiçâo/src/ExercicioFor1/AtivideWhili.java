package ExercicioFor1;

import java.util.Scanner;

public class AtivideWhili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, menor=0, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0){
		   menor++;
		  if(idade <= 21){
		  }
		  else if(idade >= 50) {
		  }  maior++;
		  
		  System.out.println("Digite uma idade: ");
          idade = leia.nextInt();
	}        
		 
            
           System.out.println("\nTotal de pessoas menores de 21: "+menor);
           System.out.println("\nTotal de pessoas maiores de 50: "+maior);
		  
		

	}

}
