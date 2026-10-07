package semana03;

public class CuentaCorriente extends Cuenta {
	private double limiteSobregiro;

	public CuentaCorriente(String titular, String numeroCuenta, double saldo, double limiteSobregiro) {
		super(titular, numeroCuenta, saldo);
		this.limiteSobregiro = limiteSobregiro;
	}

	@Override
	public void retirar(double monto) {
		if (monto <= 0) {
			System.out.println("Monto invalido!!");
		} else if (monto > this.saldo + this.limiteSobregiro) {
			System.out.println("Excede el limite de sobregiro!!");
		} else {
			this.saldo = this.saldo - monto;

			System.out.println(getTitular() + " queda con: S/" + this.saldo);
		}
	}

}
