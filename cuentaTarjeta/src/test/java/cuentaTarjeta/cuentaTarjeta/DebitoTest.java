package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dominio.Cuenta;
import dominio.Debito;

import java.util.Date;

public class DebitoTest {
	Cuenta cuenta;
	Debito debito;
	
	@BeforeEach
	void init() {
		cuenta = new Cuenta("9876", "Manu Diaz");
		debito = new Debito("9876", "Manu Diaz", new Date());
	}
	@AfterEach
	void finish() {
		cuenta = null;
	}

    @Test
    public void testRetirar() throws Exception {
    	cuenta.ingresar(100);
        debito.setCuenta(cuenta);
        debito.retirar(50.0);

        assertEquals(50.0, debito.getSaldo());
    }

    @Test
    public void testIngresar() throws Exception {
        Cuenta cuenta = new Cuenta("9876", "Manu Diaz");
        cuenta.ingresar(1000);
        
        Debito debito = new Debito("9876", "Manu Diaz", new Date());
        debito.setCuenta(cuenta);
        
        debito.ingresar(200); 
        

        assertEquals(1200, debito.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
    	
    	Cuenta cuenta = new Cuenta("9876", "Manu Diaz");
        cuenta.ingresar(1000);
        
        Debito debito = new Debito("9876", "Manu Diaz", new Date());
        debito.setCuenta(cuenta);
     
        debito.pagoEnEstablecimiento("Tienda si", 300); 
        assertEquals(700, debito.getSaldo(), 0.001);
    }
}
