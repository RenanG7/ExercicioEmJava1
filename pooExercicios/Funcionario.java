package pooExercicios;

public class Funcionario {

	private String nome;
	private int idade;
	private float salario;
	private String setor;
	private String cargo;

	public Funcionario(String nome, int idade, float salario, String setor, String cargo) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setor;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void ver() {
		System.out.println("\nO funcionario de nome " + nome + " de idade " + idade + " com o salario de: " + salario
				+ " do setor " + setor + " e do cargo " + cargo);
	}

}
