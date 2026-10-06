package semana02;

public class Banco {

	public static void main(String[] args) {
		
		CuentaAhorro ca1 = new CuentaAhorro("Maria", "546123789", 1000, 5);
		
		ca1.aplicarInteres();
		ca1.mostrarInfo();
		
	}

}
