package semana03;

public class Cuenta {
	private String titular;
	private String numeroCuenta;
	protected double saldo;
	
	//constructor
	public Cuenta(String titular, String numeroCuenta, double saldo) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean depositar(double monto) {
		if(monto>0) {
			this.saldo = this.saldo + monto;
			return true;
		}else {
			System.out.println("Monto invalido!!");
			return false;
		}
	}
	
	public boolean retirar(double monto) {
		if(monto<=0) {
			return false;
		}else if(monto>this.saldo) {
			return false;
		}else {
			this.saldo = this.saldo - monto;
				return true;
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Titular: " + this.titular + "\n" + "N de Cuenta: " + this.numeroCuenta + "\n" + "Saldo disponible: S/" + this.saldo);
	}
}
