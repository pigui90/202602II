package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class EjerciciosClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu = "*************************\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Salir\n*************************\nIngrese una opcion";
		int numero1;
		int numero2;
		int sumDivisores1 = 0;
		int sumDivisores2 = 0;
		String dia;
		String mes;
		String year;
		String fecha;
		Date fechaDate;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date hoy = new Date();
		try {
			hoy = sdf.parse(sdf.format(hoy));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Error con el formato de la fecha" + e.getMessage(),
					"Error al parsear", JOptionPane.ERROR_MESSAGE);		}
		int opcion = 0;
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (opcion) {
				case 1:
					numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
					numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
					for (int i = 1; i < numero1; i++) {
						if (numero1 % i == 0) {
							sumDivisores1 = sumDivisores1 + i;
						}
					}

					for (int i = 1; i < numero2; i++) {
						if (numero2 % i == 0) {
							sumDivisores2 += i;
						}
					}

					if (numero1 == sumDivisores2 && numero2 == sumDivisores1) {
						JOptionPane.showMessageDialog(null, "Son amigos");
					} else {
						JOptionPane.showMessageDialog(null, "No son amigos");
					}
					break;
				case 2:
					try {
						dia = JOptionPane.showInputDialog("Ingrese el dia");
						mes = JOptionPane.showInputDialog("Ingrese el mes");
						year = JOptionPane.showInputDialog("Ingrese el año");
						fecha = dia + "-" + mes + "-" + year;
						fechaDate = sdf.parse(fecha);
						JOptionPane.showMessageDialog(null, hoy);
						JOptionPane.showMessageDialog(null, fechaDate);
						if (fechaDate.before(hoy)) {
							JOptionPane.showMessageDialog(null, "La fecha esta antes de la fecha de hoy");
						} else {
							if (fechaDate.after(hoy)) {
								JOptionPane.showMessageDialog(null, "La fecha esta despues de la fecha de hoy");
							}else {
								JOptionPane.showMessageDialog(null, "La fecha es igual a la fecha de hoy");
							}
						}
					} catch (ParseException pe) {
						JOptionPane.showMessageDialog(null, "Error con el formato de la fecha" + pe.getMessage(),
								"Error al parsear", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:

					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Adiosin");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no existe", "Cuidado", JOptionPane.WARNING_MESSAGE);

					break;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		} while (opcion != 4);
	}

}
