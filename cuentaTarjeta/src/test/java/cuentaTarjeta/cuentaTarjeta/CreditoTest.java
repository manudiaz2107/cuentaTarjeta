package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dominio.Credito;
import java.util.Date;

public class CreditoTest {

    @Test
    public void testRetirar() throws Exception {
        Credito credito = new Credito("1234", "John Doe", new Date(), 1000.0);
        credito.retirar(500.0);

        // Asegúrate de que el saldo sea correcto después de retirar
        assertEquals(500.0, credito.getSaldo());
    }

    @Test
    public void testIngresar() throws Exception {
        Credito credito = new Credito("1234", "John Doe", new Date(), 1000.0);
        credito.ingresar(200.0);

        // Asegúrate de que el saldo sea correcto después de ingresar
        assertEquals(200.0, credito.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        Credito credito = new Credito("1234", "John Doe", new Date(), 1000.0);
        credito.pagoEnEstablecimiento("Tienda", 50.0);
        credito.pagoEnEstablecimiento("Restaurante", 30.0);

        // Asegúrate de que el saldo sea correcto después de los pagos
        assertEquals(80.0, credito.getSaldo());
    }

}
