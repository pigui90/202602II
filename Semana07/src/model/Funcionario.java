package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Persona {

	private String lugarTrabajo;
	private String gradoAcademico;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String lugarTrabajo, String gradoAcademico, String nombre, String residencia, int identificacion, int edad, Date fechaNacimiento) {
		super(nombre, identificacion, edad, residencia, fechaNacimiento);
		this.lugarTrabajo = lugarTrabajo;
		this.gradoAcademico = gradoAcademico;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	
//	@Override
//	public String mePresento() {
//		return "Hola, soy un funcionario y laboro en " + getLugarTrabajo() + "\n"+ super.mePresento(); 
//	}
	
	@Override
	public String mePresento() {
		return "Hola, soy un funcionario y laboro en " + getLugarTrabajo(); 
	}
	
//	@Override
//	public String mePresento() {
//		// TODO Auto-generated method stub
//		return super.mePresento();
//	}
//	
	
	@Override
	public boolean equals(Object obj) {
		Funcionario fun = (Funcionario) obj;
		if(fun.getIdentificacion() == this.getIdentificacion() 
				&& fun.getGradoAcademico().equals(this.getGradoAcademico())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = sdf.format(getFechaNacimiento());
		String info = "Nombre: " + getNombre()+ "\nIdentificacion: " + getIdentificacion() + "\nEdad: " + getEdad()
		+ "\nResidencia: " + getResidencia() + "\nFecha Nacimiento: " + fecha 
		+ "\nLugar Trabajo: " + getLugarTrabajo() + "\nGrado Academico: " + getGradoAcademico();
		return info;
	}
	
	
	
	
}
