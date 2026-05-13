package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String menu = "1- Ejercicio Matematico1\n2- Salir";
		Scanner scan = new Scanner(System.in);
		
		
		int opcion = 0;

		do {
			System.out.println(menu);
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int numero1 = 0;
				int numero2 = 0;
				int resultado = 0;
				System.out.println("Ingrese el primer valor");
				numero1 = scan.nextInt();
				System.out.println("Ingrese el segundo valor");
				numero2 = scan.nextInt();
				resultado = ejercicioMatematico(numero1, numero2);
				System.out.println("El resultado final es " + resultado);
				break;
			case 2:
				System.out.println("Saliendo!!!!!...");
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 2);
		
		scan.close();

	}

	public static int ejercicioMatematico(int num1, int num2) {
		int total = 0;
		total = (num1 * 5) + (num2 + 10);
		return total;
	}

}
