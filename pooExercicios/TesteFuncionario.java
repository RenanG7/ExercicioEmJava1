package pooExercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Renan",24,2200,"corte","operador de maquinas");
		
		funcionario1.ver();
		funcionario1.setSalario(2250);
		funcionario1.ver();
		
		
		Funcionario funcionario2 = new Funcionario("rafael",33,3000,"corte","Supervisor");
		funcionario2.ver();
	}

}
