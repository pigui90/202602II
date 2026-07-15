package model;

public class Contexto {

	private Estrategia estrategia;
	private String nombre;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void calcularImpuestos() {
		this.estrategia.calcularImpuestos();
	}
	
	public String mostrarImpuestos() {
		return this.estrategia.mostrarImpuestos();
	}
	
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public Estrategia getEstrategia() {
		return this.estrategia;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hola " + getNombre() + " sus impuestos a calculados es " + mostrarImpuestos();
	}
}
