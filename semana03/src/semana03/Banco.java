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
}
