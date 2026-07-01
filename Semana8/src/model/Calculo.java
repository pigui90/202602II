package model;

public class Calculo {
	
	private int numeroA;
	private int numeroB;
	
	public int getNumeroA() {
		return numeroA;
	}
	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}
	public int getNumeroB() {
		return numeroB;
	}
	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	public boolean esMayor() {
		return numeroA > numeroB;
	}
	
	public boolean esMenor() {
		return numeroA < numeroB;
	}
	
	public boolean esIgual() {
		return numeroA == numeroB;
	}

	
	
}
