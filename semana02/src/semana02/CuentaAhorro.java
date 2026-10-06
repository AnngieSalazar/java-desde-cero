package semana02;

public class CuentaAhorro extends Cuenta {
	private double tasaInteres;  //en porcentaje, por ejemplo 5 = 5%
	
	public CuentaAhorro(String titular, String numeroCuenta, double saldo, double tasaInteres) {
		super(titular, numeroCuenta, saldo);
		this.tasaInteres = tasaInteres;
	}
	
	
	public void aplicarInteres() {
		double interes;
		interes =  (getSaldo() * this.tasaInteres) / 100;
		depositar(interes);
	}

}
