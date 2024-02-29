package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dominio.Debito;

import java.util.Date;

public class DebitoTest {

    @Test
    public void testRetirar() throws Exception {
        Debito debito = new Debito("9876", "Alice Doe", new Date());
        debito.retirar(50.0);

        // Asegúrate de que el saldo sea correcto después de retirar
        assertEquals(-50.0, debito.getSaldo());
    }

    @Test
    public void testIngresar() throws Exception {
        Debito debito = new Debito("9876", "Alice Doe", new Date());
        debito.ingresar(100.0);

        // Asegúrate de que el saldo sea correcto después de ingresar
        assertEquals(100.0, debito.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        Debito debito = new Debito("9876", "Alice Doe", new Date());
        debito.pagoEnEstablecimiento("Supermercado", 30.0);

        // Asegúrate de que el saldo sea correcto después del pago en establecimiento
        assertEquals(-30.0, debito.getSaldo());
    }
}
