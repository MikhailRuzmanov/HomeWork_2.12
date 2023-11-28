package pro.sky.skyprospringtest.Homework212.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImpTest {
    private final CalculatorService calculatorService = new CalculatorServiceImp();

    @Test
    void welcome() {
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(expected, calculatorService.welcome());
    }

    @Test
    void plus() {
        int expected = 27;
        assertEquals(expected, calculatorService.plus(13, 14));
    }

    @Test
    void minus() {
        int expected = -9;
        assertEquals(expected, calculatorService.minus(10, 19));

    }

    @Test
    void multiply() {
        int expected = 35;
        assertEquals(expected, calculatorService.multiply(5, 7));
    }

    @Test
    void divide() {
        int expected = 5;
        assertEquals(expected, calculatorService.divide(65, 13));
    }
    @Test
    void divideByZero(){
        assertThrows(IllegalArgumentException.class, ()->calculatorService.divide(54,0));
    }
    @Test
    void divideByNull(){
        assertThrows(NullPointerException.class, ()->calculatorService.divide(75, null));
    }
}