package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dominio.Credito;
import dominio.Cuenta;

import java.util.Date;

public class CreditoTest {

    @Test
    public void testRetirar() throws Exception {
    	Cuenta cuenta = new Cuenta("1234", "Manu Diaz");
        Credito credito = new Credito("1234", "Manu Diaz", new Date(), 1000.0);
        credito.setCuenta(cuenta);
        credito.retirar(500.0);

        assertEquals(500.0, credito.getSaldo());
    }

    @Test
    public void testIngresar() throws Exception {
        Credito credito = new Credito("1234", "Manu Diaz", new Date(), 1000.0);
        credito.ingresar(200.0);

        assertEquals(200.0, credito.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        Credito credito = new Credito("1234", "Manu Diaz", new Date(), 1000.0);
        credito.pagoEnEstablecimiento("Tienda", 50.0);
        credito.pagoEnEstablecimiento("Restaurante", 30.0);

        assertEquals(80.0, credito.getSaldo());
    }

}
