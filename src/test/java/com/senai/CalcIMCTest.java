package com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcIMCTest {

    @Test
    public void testarCalculoIMC() {

        CalcIMC calculadora = new CalcIMC();

        double resultado = calculadora.calcularIMC(80, 2.0);

        assertEquals(20.0, resultado, 0.001);
    }
}