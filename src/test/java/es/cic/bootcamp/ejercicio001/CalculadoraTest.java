package es.cic.bootcamp.ejercicio001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calculadora;
	@BeforeEach
	void setUp() throws Exception {
	this.calculadora = new Calculadora();
	}

	@Test
	void testSumar() {
		
		
		int a = 4;
		int s1 = 5;
		
		int resultado= calculadora.sumar(a, s1);
		
		assertEquals(9,resultado,"La suma no es correcta");
	}

	@Test
	void testSumarNegativos() {
		
		
		int a = -4;
		int s1 = -5;
		
		int resultado= calculadora.sumar(a, s1);
		
		assertEquals(-9,resultado,"La suma de negativos no es correcta");
	}
	

}
