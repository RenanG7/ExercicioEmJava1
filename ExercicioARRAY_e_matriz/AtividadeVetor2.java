package ExercicioARRAY_e_matriz;

import java.util.Scanner;

public class AtividadeVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numeros[] = new float[10];
		float par, impar, somaT = 0, media;
		int x;
		Scanner leia = new Scanner(System.in);

		for (x = 1; x < 10; x++) {
			System.out.println("\nDigite um numero: ");
			numeros[x] = leia.nextInt();
			somaT = somaT + numeros[x];
		}
		for (x = 1; x < 10; x++) {
			if (x % 2 == 1) {
				impar = numeros[x];
				System.out.println("\nO numero " + impar + " esta no indicie impar");
			}
		}
		for (x = 1; x < 10; x++) {
			if (numeros[x] % 2 == 0) {
				par = numeros[x];
				System.out.println("\nO numero " + par + " é um numero par");
			}

		}
		media = somaT/10;
		System.out.println("\nA soma de todos os indicies " +somaT+ " é a media é "+media);

	}

}
