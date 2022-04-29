package com.daniel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta("Daniel", 1000.264215);
		assertEquals("Daniel", cuenta.getPersona());
	}
	
	

}
