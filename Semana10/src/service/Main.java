package service;

import javax.swing.JOptionPane;

import model.Conexion;
import model.Contexto;
import model.EstrategiaIntermedia;
import model.EstrategiaNormal;

public class Main {

	public static void main(String[] args) {

//		Conexion conexion = Conexion.getConn();
//		
//		JOptionPane.showMessageDialog(null, conexion.toString());
//
//		Conexion conexion2 = Conexion.getConn();
//		
//		JOptionPane.showMessageDialog(null, conexion2.toString());
//		
		EstrategiaIntermedia estrategiaIntermedia = new EstrategiaIntermedia();
		
		Contexto contexto = new Contexto(new EstrategiaNormal()); 
		contexto.setNombre("Sergio");
		
		contexto.calcularImpuestos();
		JOptionPane.showMessageDialog(null, contexto.toString());

		Contexto contexto2 = new Contexto(estrategiaIntermedia);
		contexto2.setNombre("Gerardo");
		contexto2.calcularImpuestos();
		JOptionPane.showMessageDialog(null, contexto2.toString());

		contexto.setEstrategia(estrategiaIntermedia);
		contexto.calcularImpuestos();

		JOptionPane.showMessageDialog(null, contexto.toString());
		
		
	}

}
