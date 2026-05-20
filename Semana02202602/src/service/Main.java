package service;

import javax.swing.JOptionPane;

/**
 * Clase Main para probar los temas de la semana 2
 */
public class Main {

	/**
	 * Constructor para que no me de el warning
	 */
	public Main() {
		
	}
	/**
	 * Metodo que sirve para ejecutar el programa y los ejercicios de la clase
	 * @param args Parametros por defecto para el funcionamiento del metodo main
	 */
	public static void main(String[] args) {

		int edad;
		try {
			// Aqui solicitamos la edad del usuario
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
			// Le sumamos 4 para calcular la edad aproximada para graduarse
			edad = edad + 4;
			JOptionPane.showMessageDialog(null, "Su edad al terminar la carrera sera de " + edad);
			// si edad es menor que 18, entonces es un genio o genia
			if(edad < 18) {
				JOptionPane.showMessageDialog(null, "Muy joven para graduarse, wow", "Muy bien!", JOptionPane.WARNING_MESSAGE);
			}
		} catch (NumberFormatException nfe) {
			// Si escribe un valor que no sea numerico muestra el siguiente mensaje de error
			JOptionPane.showMessageDialog(null, "Error al digitar el valor numerico", "Error al parsear",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
