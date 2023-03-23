package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		int opcao;
		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.println("**********************************");
			System.out.println();
			System.out.println("   1- Adicionar livro na pilha    ");
			System.out.println("   2- Listar todos os livros      ");
			System.out.println("   3- Retirar livros da pilha     ");
			System.out.println("   0- Sair                        ");
			System.out.println();
			System.out.println("**********************************");
			System.out.println("Entre com a opção desejada:       ");
			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("Você saiu lista de livros ");
				System.exit(0);
			}
			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome do livro que deseja adicionar: ");
				leia.nextLine();
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("\nO nome " + nome + "foi adicionado\nSegue a pilha de livros" + pilha);
				break;
			case 2:
				System.out.println("\nAqui esta todos os livros da pilha " + pilha);
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha esta vazia!! ");
				} else {
					System.out.println("\nVocê removeu " + pilha.pop());
					System.out.println("\nSegue a lista de livros restante "+pilha);
				}
				break;
			default:
				System.out.println("\nOpção invalida!!");

			}

		}

	}
}
