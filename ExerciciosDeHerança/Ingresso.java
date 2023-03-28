package ExerciciosDeHerança;

public class Ingresso {

	private float valor;
	private String cor;
	private String endereco;

	public Ingresso(float valor, String cor, String endereco) {
		super();
		this.valor = valor;
		this.cor = cor;
		this.endereco = endereco;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void infIngreço() {
		System.out.println(
				"\nO ingresso é de no valor de: " + valor + " na cor " + cor + " informando o endereço de: " + endereco);
	}

}
