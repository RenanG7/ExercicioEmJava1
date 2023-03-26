package pooExercicios;

public class Cliente {
	private String nome;
	private String Sexo;
	private int idade;
	private String endereco;
	private String telefone;

	public Cliente(String nome, String sexo, int idade, String endereco, String telefone) {
		this.nome = nome;
		Sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void infCliente() {
		System.out.println("\nO cliente de nome " + nome + ", do sexo " + Sexo + ", de idade " + idade
				+ " reside no endereço " + endereco + " de telefone " + telefone);
	}
}
