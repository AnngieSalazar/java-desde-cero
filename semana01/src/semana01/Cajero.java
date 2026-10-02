package semana01;
import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		double saldo = 1000;
		double montoRetirar;
		
		System.out.println("Escriba su nombre:");
		nombre= sc.nextLine();
		
		System.out.println("Escriba el monto a retirar:");
		montoRetirar= sc.nextDouble();
		
		if(montoRetirar<=0) {
			System.out.println("Monto invalido!!");
			
		}else if(montoRetirar> saldo) {
			System.out.println("Saldo insuficiente!!");
			System.out.println("Su saldo es de: S/" + saldo);
		}else{
			saldo= saldo-montoRetirar;
			System.out.println("Hola " + nombre + ", retiro exitoso!");
			System.out.println("Saldo restante: S/" + saldo);
			
		}
		
		sc.close();

	}

}
