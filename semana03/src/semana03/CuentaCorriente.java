package semana03;

public class CuentaCorriente extends Cuenta {
	private double limiteSobregiro;

	public CuentaCorriente(String titular, String numeroCuenta, double saldo, double limiteSobregiro) {
		super(titular, numeroCuenta, saldo);
		this.limiteSobregiro = limiteSobregiro;
	}

	@Override
	public boolean retirar(double monto) {
		if (monto <= 0) {
			return false;
		} else if (monto > this.saldo + this.limiteSobregiro) {
			return false;
		} else {
			this.saldo = this.saldo - monto;
			return true;
		}
	}

}
