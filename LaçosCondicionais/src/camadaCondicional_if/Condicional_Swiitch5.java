package camadaCondicional_if;

import java.util.Scanner;

public class Condicional_Swiitch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nome;
		int L1, Vtotal; 
		float pre1;
		Scanner leia = new Scanner(System.in);
		 System.out.println("\nOlá senhor(a) você pode fazer seu pedido comigo!\ntemos estas opções de lanche ! ");
		 System.out.println("Opção(1), Cachorro quente! \nOpção(2), X-Salada! \nOpção(3), X-bacon! ");
		 System.out.println("\nOpção(4), Bauru! E de babidas temos \nOpção(5), Refrigerante \nOpção(6), Suco de laranja!");
		 nome = leia.nextInt();
		 System.out.println("\nQuantos lanches você vai querer? ");
		 L1 = leia.nextInt();
		 
	    switch(nome){
		case 1:
			pre1 = (float) 10.00;
			Vtotal = (int) pre1 * L1;
			System.out.println("\nO valor total do seu pedido é " +Vtotal);
			break;
	      
		case 2:
				pre1 = (float) 15.00;
				Vtotal = (int) pre1 * L1;
				System.out.println("\nO valor total do seu pedido é " +Vtotal);
				break;
		         
		case 3:
			pre1 = (float) 18.00;
			Vtotal = (int) pre1 * L1;
			System.out.println("\nO valor total do seu pedido é " +Vtotal);
			break;
			
		case 4:
				pre1 = (float) 12.00;
				Vtotal = (int) pre1 * L1;
				System.out.println("\nO valor total do seu pedido é " +Vtotal);
				break;
				
		case 5:
			pre1 = (float) 8.00;
			Vtotal = (int) pre1 * L1;
			System.out.println("\nO valor total do seu pedido é " +Vtotal);
			break;
			
		case 6:
			pre1 = (float) 13.00;
			Vtotal = (int) pre1 * L1;
			System.out.println("\nO valor total do seu pedido é " +Vtotal);
			break;
		 default:
		 System.out.println("\nDigite uma opção valida ");
		         
	         		
		}
		 
	}

}
