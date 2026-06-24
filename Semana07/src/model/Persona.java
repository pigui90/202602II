package model;

import java.util.Date;

public class Persona {

	private String nombre;
	private int identificacion;
	private int edad;
	private String residencia;
	private Date fechaNacimiento;

	public Persona() {

	}

	public Persona(String nombre, int identificacion, int edad, String residencia, Date fechaNacimiento) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.edad = edad;
		this.residencia = residencia;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String mePresento() {
		return "Hola! soy la persona " + getNombre() + " y mi edad es " + getEdad();
	}
	
}
