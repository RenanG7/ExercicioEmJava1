package estruturaDeDados;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		String nome;
        Scanner leia = new Scanner(System.in);
		
		while(true) {
		System.out.println("**********************************");
		System.out.println(                                    );
		System.out.println("   1- Adicionar cliente a fila    ");
		System.out.println("   2- Listar todos os clientes    ");
		System.out.println("   3- Retirar clientes da fila    ");
		System.out.println("   0- Sair                        ");
		System.out.println(                                    );
		System.out.println("**********************************");
		System.out.println("Entre com a opção desejada:       ");
		int opcao = leia.nextInt(); 
		if(opcao == 0) {
			System.out.println(" Você saiu da lista ");
			System.exit(0);
		}
		switch(opcao){
		
		case 1:
			System.out.println("\nDigite o nome que Deseja adicionar: ");
			leia.nextLine();
			nome = leia.nextLine();
			fila.add(nome);
			System.out.println("\nO nome "+nome+ "foi adicionado\n segue a lista"+fila);
			break;
		case 2:
			System.out.println("\nEstes são todos os clientes\n"+fila);
			break;
		case 3:
			if(fila.isEmpty()) {
				System.out.println("\nA fila esta vazia: ");
			}else {
				System.out.println("\nVocê removeu o "+fila.poll());
			}
			break;
		default:
			System.out.println("\nOpção invalida!! ");
			break;
		}
          
	}

}


	}


