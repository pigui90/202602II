package model;

import javax.swing.JOptionPane;

public class EstrategiaNormal implements Estrategia {

	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "Impuesto es de 30%");
	}

	@Override
	public String mostrarImpuestos() {
		// TODO Auto-generated method stub
		return "Impuesto es de 30%";
	}
	
}
