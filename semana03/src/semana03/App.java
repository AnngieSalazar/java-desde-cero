package semana03;

public class App {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Luis", "111", 1000);
		CuentaAhorro ca1 = new CuentaAhorro("Juan", "222", 2000, 5);
		CuentaCorriente cc1 = new CuentaCorriente("Pedro", "333", 500, 200);
		
		Banco b = new Banco("NN");
		b.agregarCuenta(c1);
		b.agregarCuenta(ca1);
		b.agregarCuenta(cc1);
		
		b.mostrarCuentas();
	
		b.transferir("111", "222", 300);
		c1.mostrarInfo();
		ca1.mostrarInfo();
		
		b.transferir("111", "222", 5000);
		
		b.transferir("111", "999", 5000);
		
		b.transferir("111", "111", 200);
		
	}

}
