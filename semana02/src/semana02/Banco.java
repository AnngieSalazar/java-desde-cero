package semana02;

public class Banco {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Anngie", "123456789", 1000);
		Cuenta c2 = new Cuenta("Michael", "987654321", 2000);
		
		c1.depositar(200);
		c1.retirar(20);
		c1.retirar(5000);
		c1.mostrarInfo();
		
		c2.retirar(0);
		c2.depositar(70);
		c2.mostrarInfo();
	}

}
