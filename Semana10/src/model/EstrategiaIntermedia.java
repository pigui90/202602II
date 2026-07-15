package model;

import javax.swing.JOptionPane;

public class EstrategiaIntermedia implements Estrategia {

	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "El impuesto es de 25%\nRebaja por cada hij@");
	}
	
	@Override
	public String mostrarImpuestos() {
		// TODO Auto-generated method stub
		return "El impuesto es de 25%\nRebaja por cada hij@";
	}

}
