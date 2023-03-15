package atividade1;

import java.util.Scanner;

public class AtividadeN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario;
		float abono;
		float novoS;
		
		System.out.println("\nDigite o seu salario: ");
		Scanner leia = new Scanner(System.in);
	    salario = leia.nextFloat();
	    
	    System.out.println("\nDigite seu abono: ");
	    abono = leia.nextFloat();
	    
	    novoS = (salario + abono);
	    System.out.println("\nSeu novo salario é "+novoS);

	}

}
