package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CamadaCollectionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> corlista = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String adcor;
	
		for(int n1=0;n1<5;n1++){
		System.out.println("\nDigite uma cor: ");
		adcor = leia.nextLine();
		corlista.add(adcor);
		}
		System.out.println(corlista);
		
		Collections.sort(corlista);//Chang collections == ele organiza a lista da forma que eu ordenar
		System.out.println("\n"+corlista);
		
		
		
		

	}

}
