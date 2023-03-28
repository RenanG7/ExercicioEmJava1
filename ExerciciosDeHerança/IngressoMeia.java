package ExerciciosDeHerança;

public class IngressoMeia extends Ingresso {

	private float valorM;

	public IngressoMeia(float valor, String cor, String endereco, float valorM) {
		super(valor, cor, endereco);
		this.valorM = valorM;
	}

	public float getValorM() {
		return valorM;
	}

	public void setValorM(float valorM) {
		this.valorM = valorM;
	}

	public void InfIngressoMeia() {
		System.out.println("\nO ingresso meia entrada vai estar saindo no valor de:" + valorM + " com a cor: "
				+ getCor() + " e informando o endereço " + getEndereco());
	}

}
