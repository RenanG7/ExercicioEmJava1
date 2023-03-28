package ExerciciosDeHerança;

public class TesteIngresso {

	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso(75,"Amarela","São Paulo");
		ingresso1.infIngreço();
		
		Vip vip1 = new Vip(0,"Amarela","São Paulo","Pulseira",120);
		vip1.InfoVip();
		
		IngressoMeia ingressoM = new IngressoMeia(0,"Amarelo","São Paulo",40);
		ingressoM.InfIngressoMeia();

	}

}
