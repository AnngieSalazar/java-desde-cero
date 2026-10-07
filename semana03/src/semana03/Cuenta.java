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
	
	public void depositar(double monto) {
		if(monto>0) {
			this.saldo = this.saldo + monto;
			System.out.println(this.titular + " Realizaste un deposito de: S/" + monto);
		}else {
			System.out.println("Monto invalido!!");
		}
	}
	
	public void retirar(double monto) {
		if(monto<=0) {
			System.out.println(this.titular + " El monto ingresado es invalido!!");
		}else if(monto>this.saldo) {
			System.out.println(this.titular + " Tu saldo es insuficiente!!");
		}else {
			this.saldo = this.saldo - monto;
				System.out.println(this.titular + " Realizaste un retiro de: S/" + monto);
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Titular: " + this.titular + "\n" + "N de Cuenta: " + this.numeroCuenta + "\n" + "Saldo disponible: S/" + this.saldo);
	}
}
