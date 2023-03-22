package collections1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CamadaCollectionsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> valores = new HashSet<Integer>();
		Scanner leia=new Scanner(System.in);
		
	   valores.add(2);
	   valores.add(5);
	   valores.add(1);
	   valores.add(3);
	   valores.add(4);
	   valores.add(9);
	   valores.add(7);
	   valores.add(8);
	   valores.add(10);
	   valores.add(6);
	   
	   for(int x =0; x<1;x++){
		   System.out.println("\nDigite o numero desejado: ");
		   int N1 = leia.nextInt();
		   
		   if(valores.contains(N1)){// este comando (.contains) ele tem o papel de verificar se o item pedido esta dentro da minha lista.
			   System.out.println("\nO numero " +N1+ " esta dentro da listagem !! ");
			   
		   }else {
			   System.out.println("\nO numero "+N1+ " não faz parte da listagem ");
		   }
	   }
	 }

	}
