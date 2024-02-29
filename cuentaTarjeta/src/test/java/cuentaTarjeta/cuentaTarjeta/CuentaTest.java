package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dominio.Cuenta;

public class CuentaTest {

    @Test
    public void testIngresar() throws Exception {
        Cuenta cuenta = new Cuenta("5678", "Jane Doe");
        cuenta.ingresar(300.0);

        // Asegúrate de que el saldo sea correcto después de ingresar
        assertEquals(300.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() throws Exception {
        Cuenta cuenta = new Cuenta("5678", "Jane Doe");
        cuenta.ingresar(500.0);
        cuenta.retirar(200.0);

        // Asegúrate de que el saldo sea correcto después de retirar
        assertEquals(300.0, cuenta.getSaldo());
    }

    @Test
    public void testIngresarConcepto() throws Exception {
        Cuenta cuenta = new Cuenta("5678", "Jane Doe");
        cuenta.ingresar("Ingreso de nómina", 1000.0);

        // Asegúrate de que el saldo sea correcto después de ingresar con concepto
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirarConcepto() throws Exception {
        Cuenta cuenta = new Cuenta("5678", "Jane Doe");
        cuenta.ingresar(500.0);
        cuenta.retirar("Pago de factura", 200.0);

        // Asegúrate de que el saldo sea correcto después de retirar con concepto
        assertEquals(300.0, cuenta.getSaldo());
    }
}
