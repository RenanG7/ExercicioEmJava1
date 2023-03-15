package atividade1;

import java.util.Scanner;

public class AtividadeN2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4, media ;
		String nome ;
		System.out.println("\nQual o seu nome para calcularmos a sua media deste bimestre? ");
		Scanner leia = new Scanner(System.in);
		nome = leia.next();
		
		System.out.println("\nOlá "+nome+ " Agora me fala sua primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nAgora me diga sua segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nAgora me diga sua terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nAgora me diga sua quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA sua media no bimestre foi "+media );
	}

}
