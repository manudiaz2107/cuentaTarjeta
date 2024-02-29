package cuentaTarjeta.cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import dominio.Movimiento;

public class MovimientoTest {

    @Test
    public void testGetImporte() {
        Movimiento movimiento = new Movimiento();
        movimiento.setImporte(25.0);

        assertEquals(25.0, movimiento.getImporte());
    }

    @Test
    public void testGetConcepto() {
        Movimiento movimiento = new Movimiento();
        movimiento.setConcepto("Compra en línea");

        assertEquals("Compra en línea", movimiento.getConcepto());
    }

    @Test
    public void testSetFecha() {
        Movimiento movimiento = new Movimiento();
        Date fecha = new Date();
        movimiento.setFecha(fecha);

        assertEquals(fecha, movimiento.getFecha());
    }
}

