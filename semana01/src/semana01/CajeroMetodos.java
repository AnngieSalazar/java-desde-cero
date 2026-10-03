package semana01;
import java.util.Scanner;

public class CajeroMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 1000;
		String nombre;
		int opcion;
		
		System.out.println("Cual es su nombre?");
		nombre = sc.nextLine();
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: consultarSaldo(nombre,saldo);
			break;
			case 2: saldo = depositar(saldo,sc);
			break;
			case 3: saldo = retirar(saldo,sc);
			break;
			case 0: System.out.println("Adios " + nombre);
			break;
			default: System.out.println("Opcion incorrecta!!");
			}
			
		}while(opcion != 0);
		sc.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("===Menu===");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Depositar");
		System.out.println("3. Retirar");
		System.out.println("0. Salir");
	}
	
	public static void consultarSaldo(String nombre, double saldo) {
		System.out.println("Hola " + nombre + " tu saldo es de S/" + saldo);
	}
	
	public static double depositar(double saldo, Scanner sc) {
		double deposito;
		System.out.println("Que monto desea depositar?");
		deposito = sc.nextDouble();
		if(deposito>0) {
			saldo = saldo + deposito;
			System.out.println("Deposito exitoso!!");
			System.out.println("Tu saldo actual es de: S/" + saldo);
		}else {
			System.out.println("Monto invalido");
		}
		return saldo;
	}
	
	public static double retirar(double saldo, Scanner sc) {
		double retiro;
		System.out.println("Que monto desea retirar?");
		retiro = sc.nextDouble();
		if(retiro<=0) {
			System.out.println("Monto invalido!!");
		}else if(retiro> saldo) {
			System.out.println("Saldo insuficiente!!");
		}else {
			saldo = saldo - retiro;
			System.out.println("Su saldo actual es de: S/" + saldo);
		}
		return saldo;
	}

}
