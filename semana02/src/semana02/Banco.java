package semana02;

public class Banco {

	public static void main(String[] args) {
		
		Cuenta[] cuentas= {
				new Cuenta("Anngie", "123456789", 1000),
				new CuentaCorriente("Michael", "987456123", 1000, 500)
		};
		
		for (Cuenta c : cuentas) {
			c.retirar(1200);
			c.mostrarInfo();
		}
	}

}
