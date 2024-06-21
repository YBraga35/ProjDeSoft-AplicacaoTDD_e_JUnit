package src.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.main.java.Calculadora;
import src.main.java.Memoria;

public class CalculadoraTest {
private Memoria memoria;
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        memoria = new Memoria();
        calculadora = new Calculadora(memoria);
    }

    @Test
    public void testSoma() {
        memoria.setValorA(5);
        memoria.setValorB(3);
        assertEquals(8, calculadora.soma());
    }

    @Test
    public void testSubtrai() {
        memoria.setValorA(5);
        memoria.setValorB(3);
        assertEquals(2, calculadora.subtrai());
    }

    @Test
    public void testMultiplica() {
        memoria.setValorA(5);
        memoria.setValorB(3);
        assertEquals(15, calculadora.multiplica());
    }

    @Test
    public void testDivide() {
        memoria.setValorA(5);
        memoria.setValorB(2);
        assertEquals(2.5, calculadora.divide(), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        memoria.setValorA(5);
        memoria.setValorB(0);
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide();
        });
    }
}
