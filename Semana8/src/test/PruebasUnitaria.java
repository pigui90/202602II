package test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Calculo;

class PruebasUnitaria {

	static Calculo calculo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculo = new Calculo();
		JOptionPane.showMessageDialog(null, "++++++++++++++++++++++++++++++++++++++++++");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "--------------------------");
	}

	@BeforeEach
	void setUp() throws Exception {
		JOptionPane.showMessageDialog(null, "///////////////////////////////////");
		calculo.setNumeroA(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero A")));
		calculo.setNumeroB(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero B")));
	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		calculo.setNumeroA(0);
		calculo.setNumeroB(0);
	}

//	@Test
//	void test() {
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero par"));
//		if(numero % 2 != 0) {
//			fail("El numero debia ser par");
//		}
//	}
	
	@Test
	void testMayor() {
		JOptionPane.showMessageDialog(null, "Test Mayor");
		assumeTrue("Se debe inicializar la instancia de calculo", calculo != null);
//		calculo.setNumeroA(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero A")));
//		calculo.setNumeroB(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero B")));
		assertTrue(calculo.esMayor(), "No es mayor\nLos valores son\nNumero A " + calculo.getNumeroA() + "\nnumero b " + calculo.getNumeroB() );
	}
	
	@Test
	void testMenor() {
		JOptionPane.showMessageDialog(null, "Test Menor");
		assumeTrue("Se debe inicializar la instancia de calculo", calculo != null);
//		calculo.setNumeroA(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero A")));
//		calculo.setNumeroB(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero B")));
		assertTrue(calculo.esMenor(), "No es menor");
	}
	
	@Test
	void testIgual() {
		JOptionPane.showMessageDialog(null, "Test Igual");
		assumeTrue("Se debe inicializar la instancia de calculo", calculo != null);
//		calculo.setNumeroA(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero A")));
//		calculo.setNumeroB(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero B")));
		assertTrue(calculo.esIgual(), "No es igual");
	}

}
