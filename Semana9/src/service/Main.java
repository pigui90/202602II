package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		int numero;
		for (int i = 0; i < numeros.length; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor"));
			numeros[i] = numero;
		}

		String[] animales = { "PERRO", "GATO", "PEZ", "BURRO" };

		for (int i = 0; i < animales.length; i++) {
			JOptionPane.showMessageDialog(null, "Animal #" + i + ": " + animales[i]);
		}

		List<Double> salarios = new ArrayList<Double>();

		salarios.add(200252.40);
		double salarioTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un salario"));
		salarios.add(salarioTotal);
		boolean continuar = true;
		while (continuar) {
			salarioTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un salario"));
			salarios.add(salarioTotal);
			continuar = Boolean.parseBoolean(JOptionPane.showInputDialog("Quiere continuar para SI digite true, para NO digite false"));
		}
		
		for (Double salarioList : salarios) {
			JOptionPane.showMessageDialog(null, "El salario es: " + salarioList);
		}
		
		for (int i = 0; i < salarios.size(); i++) {
			JOptionPane.showMessageDialog(null, "El salario #: "+ i + " es: " + salarios.get(i));
		}
		
		
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una posicion"));
		
		for(int i = 0 ; i < salarios.size(); i++) {
			if(posicion == i) {
				salarios.remove(i);
				JOptionPane.showMessageDialog(null, "Salario eliminado");
			}
		}
		
		for (Iterator<Double> iterator = salarios.iterator(); iterator.hasNext();) {
			Double salNext =  iterator.next();
			JOptionPane.showMessageDialog(null, "Salario -> " + salNext);
		}
		

	}

}
