package ExercicioARRAY_e_matriz;

import java.util.Scanner;

public class atividadeVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] V = new int[] {2,5,1,3,4,9,7,8,10,6};
		int Num1, x, cont=0;
		Scanner leia =new Scanner(System.in);
		
		//aqui pedi para o usuario digitar um numero qualquer
		
		System.out.println("\nDigite um numero: ");
		Num1 = leia.nextInt();
		
		//vamos verificar o valor digitado com o valor do vetor 
		
		for(x=0; x<10; x++ ){
	    if( V[x] == Num1) {
	    	cont++;
	    	System.out.println("O numero que esta nesta posição é " +x);
	    	
	    }
	    if(cont == 0) {
	    	System.out.println("\nNumero nao encontrado ");
	    }
		
		}
		
		
		
		
		

	}

}
