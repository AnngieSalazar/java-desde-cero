package semana03;
import java.util.ArrayList;
public class Banco {
	private String nombre;
	private ArrayList<Cuenta> cuentas;
	
	//constructor
	public Banco (String nombre) {
		this.nombre = nombre;
		this.cuentas = new ArrayList<>(); 
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	//Metodos
	public void agregarCuenta(Cuenta c) {
		cuentas.add(c);
	}
	
	public void mostrarCuentas() {
		if(cuentas.size() != 0 ) {
			for(Cuenta c: cuentas) {
				System.out.println("N de cuenta de " + c.getTitular() + ": " + c.getNumeroCuenta());
			}	
		}else {
			System.out.println("Aun no hay cuentas agregadas!!");
		}
	}
	
	public Cuenta buscarCuenta(String numeroCuenta) {
	
		for(Cuenta c: cuentas) {
			if(c.getNumeroCuenta().equals(numeroCuenta)) {
				return c;
			}
		}
		return null;
	}
	
	public void transferir(String numOrigen, String numDestino, double monto) {
		Cuenta origen = buscarCuenta(numOrigen);
		Cuenta destino = buscarCuenta(numDestino);
		if(origen == null || destino == null )  {
			System.out.println("Cuenta no encontrada");
		}else if(origen == destino){
			System.out.println("La cuenta de destino es la misma que la origen!!");
		}else{
			if(origen.retirar(monto)) {
				destino.depositar(monto);
				System.out.println("Transferencia exitosa!!");
			}else {
				System.out.println("Transferencia fallida: Monto invalido o saldo insuficiente");
			}
			
		}
	}
}
