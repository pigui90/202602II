package service;

import javax.swing.JOptionPane;

public class Ejercicio {

	public static void main(String[] args) {
		String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4 Ejercicio 4";
		int opcion = 0;
		double numero;
		double numero2;
		double resultado = 0;
		double total = 0;
		boolean continuar;
		String nombre = "";
		String acumulador = "";
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		String texto = "";
		switch (opcion) {
		case 1:
			numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
			while (numero != 0) {
				if (numero < 0) {
					JOptionPane.showMessageDialog(null, "Solo numeros positivos");
				} else {
					for (int i = 1; i <= numero; i++) {
						resultado = i / numero;
						acumulador = acumulador + "\n" + resultado;
					}
					JOptionPane.showMessageDialog(null, acumulador);
				}
				numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
			}
			break;
		case 2:
			texto = JOptionPane.showInputDialog("Ingrese un texto o una palabra");
			while (!texto.equals("Fin")) {
				acumulador = "";
				for (int i = 0; i < texto.length(); i++) {
					acumulador = acumulador + texto.charAt(i) + "  ";
				}
				JOptionPane.showMessageDialog(null, acumulador);
				texto = JOptionPane.showInputDialog("Ingrese otro texto o una palabra");
			}
			break;
		case 3:
			acumulador = "";
			resultado = 0;
			numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
			// suma de los dos numeros
			acumulador = acumulador + " " + numero + " + " + numero2 + " = " + (numero + numero2) + "\n";
			resultado = resultado + (numero + numero2);
			// resta de los dos numeros
			acumulador = acumulador + " " + numero + " - " + numero2 + " = " + (numero - numero2) + "\n";
			resultado = resultado + (numero - numero2);
			// multiplicacion de los dos numeros
			acumulador = acumulador + " " + numero + " * " + numero2 + " = " + (numero * numero2) + "\n";
			resultado = resultado + (numero * numero2);
			// division de los dos numeros
			acumulador = acumulador + " " + numero + " / " + numero2 + " = " + (numero / numero2) + "\n";
			resultado = resultado + (numero / numero2);
			acumulador = acumulador + "La suma de los resultados es " + resultado;
			JOptionPane.showMessageDialog(null, acumulador);
			break;
		case 4:
			do {
				nombre = JOptionPane.showInputDialog("Ingrese un nombre");
				JOptionPane.showMessageDialog(null, "Hola, bienvenido " + nombre);
				continuar = Boolean.parseBoolean(
						JOptionPane.showInputDialog("Digite True si quiere continuar, False si quiere terminar"));
			} while (continuar);
			break;
		default:
			break;
		}

	}

}
