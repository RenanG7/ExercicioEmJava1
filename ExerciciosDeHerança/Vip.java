package ExerciciosDeHerança;

public class Vip extends Ingresso {

	private String modelo;
	private float valorV;

	public Vip(float valor, String cor, String endereco, String modelo, float valorV) {
		super(valor, cor, endereco);
		this.modelo = modelo;
		this.valorV = valorV;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getValorV() {
		return valorV;
	}

	public void setValorV(float valorV) {
		this.valorV = valorV;
	}

	public void InfoVip() {
		System.out.println("\nO ingresso Vip tem um modelo em :" + modelo + " vai sair no valor de: " + valorV
				+ " com a informação do endereço: " + getEndereco()+" na cor "+getCor());
	}

}
