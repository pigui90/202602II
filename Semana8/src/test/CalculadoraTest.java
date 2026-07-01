package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Calculadora;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(5, 6);
		assertEquals(11, resultado);
	
	}

	@Test
	void testRestar() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplicar() {
		fail("Not yet implemented");
	}

	@Test
	void testDividir() {
		fail("Not yet implemented");
	}

}
