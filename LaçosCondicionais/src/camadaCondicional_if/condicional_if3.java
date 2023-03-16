package camadaCondicional_if;

import java.util.Scanner;

public class condicional_if3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade, res; 
		boolean op;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nQual o seu nome? ");
		nome = leia.nextLine();
		
		System.out.println("\nQual a sua idade? ");
		idade = leia.nextInt();
		
		System.out.println("\nVocê ja doou sangue alguma vez? ");
		op = leia.nextBoolean();
		
		if(idade >= 18 && idade <=59 ) {
			System.out.println(nome + " esta apto a doar sangue!");
		}
			
		else if(idade >= 60 && idade <=69) {
		if(op == true ) {
			System.out.println(nome+ " a você esta apto a doar ");}
		else{
			System.out.println("\nNão esta apto a doar ");
		}
			
		}

	

	
		
	

	
		
	}

}
