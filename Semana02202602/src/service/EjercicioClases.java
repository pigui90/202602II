package service;

import javax.swing.JOptionPane;

/**
 * Clase Main para probar los temas de la semana 2
 */
public class EjercicioClases {

	/**
	 * Metodo que sirve para ejecutar el programa y los ejercicios de la clase
	 * 
	 * @param args Parametros por defecto para el funcionamiento del metodo main
	 */
	public static void main(String[] args) {
		// Se define el menu para el sistema
		String menu = "1* Ejercicio 1\n2* Ejercicio 2\n3*Ejercicio 3\n4* Ejercicio 4\n5* Salir\nSeleccione una opcion:";
		int opcion = 0;
		do {
			try {
				// Mostramos el menu al usuario
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				// Evaluamos la opcion que escogio el usuario
				switch (opcion) {
				case 1:
					// Invocamos o llamamos el metodo averiguarNumeroParImpar
					averiguarNumeroParImpar();
					break;
				case 2:
					double numAleatorio = (Math.random() * 10) + 1;
					adivinaNumero(numAleatorio);
					break;
				case 3:
					dividirNumeros();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Saliendo.....", "Chao", JOptionPane.WARNING_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no existe.....", "Ojo", JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrectamente", "EEEEEERRRROORRRR",
						JOptionPane.ERROR_MESSAGE);
			}
			// Si digitan la opcion 5, se sale del ciclo
		} while (opcion != 5);
	}

	/**
	 * Metodo para averiguar si un numero es Par o impar
	 */
	public static void averiguarNumeroParImpar() {
		int numero = 0;

		do {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor numerico"));

				if (numero > 0) {

					if (numero % 2 == 0) {
						JOptionPane.showMessageDialog(null, "El numero es par");
					} else {
						JOptionPane.showMessageDialog(null, "El numero es impar");
					}

				} else {
					JOptionPane.showMessageDialog(null, "El numero debe ser mayor a 0", "Cuidado!!",
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrectamente", "EEEEEERRRROORRRR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (numero <= 0);
	}

	/**
	 * Metodo para jugar al adivina el numero
	 * 
	 * @param aleatorio Numero que debe adivinar el usuario, pero con decimales
	 */
	public static void adivinaNumero(double aleatorio) {
		// Se le quitan los decimales al numero aleatorio
		int aleatorioAdivinar = (int) aleatorio;
		int usuarioAdivina = 0;
		do {
			try {
				// se solicita un numero al usuario
				usuarioAdivina = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese un valor para adivinar entre 1 y 10"));

				// Se evalua si son iguales
				if (usuarioAdivina == aleatorioAdivinar) {
					JOptionPane.showMessageDialog(null, "Adivino el numero, muy bien");
				} else {
					JOptionPane.showMessageDialog(null, "Intente de nuevo");
				}

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrectamente", "EEEEEERRRROORRRR",
						JOptionPane.ERROR_MESSAGE);
			}
			// Si no lo adivina o son diferentes, vuelvo a preguntar el numero
		} while (usuarioAdivina != aleatorioAdivinar);

	}

	public static void dividirNumeros() {
		double num1;
		double num2;
		boolean divisionCorrecta = false;
		do {
			try {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
				if (num2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0",
							"EEEEEERRRROORRRR", JOptionPane.ERROR_MESSAGE);
					divisionCorrecta = false;
				} else {
					JOptionPane.showMessageDialog(null, "El resultado de la division es " + (num1 / num2));
					divisionCorrecta = true;
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrectamente", "EEEEEERRRROORRRR",
						JOptionPane.ERROR_MESSAGE);
				divisionCorrecta = false;
			} catch (ArithmeticException ae) {
				JOptionPane.showMessageDialog(null, "No se puede dividir entre 0 \n" + ae.getMessage(),
						"EEEEEERRRROORRRR", JOptionPane.ERROR_MESSAGE);
				divisionCorrecta = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No se porque pero fallo \n" + e.getMessage(), "EEEEEERRRROORRRR",
						JOptionPane.ERROR_MESSAGE);
			}

		} while (!divisionCorrecta);
	}

}
