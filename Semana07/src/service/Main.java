package service;

import java.util.Date;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.Persona;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setEdad(85);
		funcionario.setFechaNacimiento(new Date());
		funcionario.setIdentificacion(1010);
		funcionario.setNombre("Pedro");
		funcionario.setResidencia("Grecia");
		funcionario.setLugarTrabajo("Grecia");
		funcionario.setGradoAcademico("Licenciado");
		
		Persona persona = new Persona();
		
		persona.setEdad(1);
		persona.setFechaNacimiento(new Date());
		persona.setIdentificacion(1312313);
		persona.setNombre("Juan");
		persona.setResidencia("Alajuela");
		
		JOptionPane.showMessageDialog(null, persona.mePresento());
		
		Funcionario funcionario2 = new Funcionario("Grecia", "Licenciado", "Pedro", "Grecia", 548285859, 85, new Date());
		
		JOptionPane.showMessageDialog(null, funcionario2.mePresento());
		
		JOptionPane.showMessageDialog(null, funcionario.toString());
		JOptionPane.showMessageDialog(null, funcionario2.toString());
		
		Funcionario funcionario3 = funcionario2;
		
		JOptionPane.showMessageDialog(null, funcionario3.toString());

		
		if(funcionario.equals(funcionario2)) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else {
			JOptionPane.showMessageDialog(null, "Son diferentes");
		}
		
		if(funcionario3.equals(funcionario2)) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else {
			JOptionPane.showMessageDialog(null, "Son diferentes");
		}
		
		funcionario3.setNombre("Luis");
		JOptionPane.showMessageDialog(null, funcionario2.getNombre());

		

		
	}

}
