package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    void testarCalcularPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double resultado = calc.calcularPotencia(220, 5);
        // 220V x 5A = 1100W
        assertEquals(1100.0, resultado, 0.01);
    }
}