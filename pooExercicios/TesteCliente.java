package pooExercicios;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Renan","masculino",24,"São Paulo","(11)948058280");
		
		cliente1.infCliente();
		cliente1.setIdade(26);
		cliente1.infCliente();
		
		Cliente cliente2 = new Cliente("Rafael","masculino",28,"São Paulo","(81)40028922");
		cliente2.infCliente();
		
	}

}
