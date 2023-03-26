package pooExercicios;

public class LojaDeGames {
	private String nome;
	private int funcionarios;
	private String endereco;
	private String telefone;
	private String ceo;

	public LojaDeGames(String nome, int funcionarios, String endereco, String telefone, String ceo) {
		this.nome = nome;
		this.funcionarios = funcionarios;
		this.endereco = endereco;
		this.telefone = telefone;
		this.ceo = ceo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
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

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public void ver() {
		System.out.println("\nLoja de games de nome " + nome + " quantidade de funcionarios " + funcionarios
				+ " localizada em " + endereco + " telefone para contato " + telefone + " o nome do dono é " + ceo);
	}

}
