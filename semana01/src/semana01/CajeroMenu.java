package semana01;

import java.util.Scanner;

public class CajeroMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		double saldo = 1000;
		double retiro;
		double deposito;
		int opcion;

		System.out.println("Cual es su nombre? ");
		nombre = sc.nextLine();

		do {
			System.out.println("===Menu===");
			System.out.println("1. Consultar saldo");
			System.out.println("2. Depositar");
			System.out.println("3. Retirar");
			System.out.println("0. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Hola " + nombre + " su saldo es de: S/" + saldo);
				break;
			case 2:
				System.out.println("Cuanto desea depositar?");
				deposito = sc.nextDouble();
				if (deposito <= 0) {
					System.out.println("Monto invalido!!");
				} else {
					saldo = saldo + deposito;
					System.out.println("Deposito exitoso!!");
					System.out.println("Su saldo actual es de: S/" + saldo);
				}
				break;
			case 3:
				System.out.println("Cuanto desea retirar?");
				retiro = sc.nextDouble();
				if (retiro <= 0) {
					System.out.println("Monto invalido!!");
				} else if (retiro > saldo) {
					System.out.println("Saldo insuficiente!!");
				} else {
					saldo = saldo - retiro;
					System.out.println("Retiro exitoso!!!");
					System.out.println("Hola " + nombre + " Realizaste un retiro de: S/" + retiro);
					System.out.println("Saldo disponible: S/" + saldo);
				}
				break;
			case 0:
				System.out.println("Adios " + nombre);
				break;
			default:
				System.out.println("Opcion invalida!!");
			}

		} while (opcion != 0);
		sc.close();
	}

}
