package pooExercicios;

public class TesteLojaDeGames {

	public static void main(String[] args) {
		
		LojaDeGames lojagames1 = new LojaDeGames("Full games",5,"São Paulo","(11)40028922","Renan");
		
		lojagames1.ver();
		lojagames1.setFuncionarios(10);
		lojagames1.ver();
		
		LojaDeGames lojames2 = new LojaDeGames("Master games",7,"Fortaleza","190","Gzuis");
		lojames2.ver();

	}

}
