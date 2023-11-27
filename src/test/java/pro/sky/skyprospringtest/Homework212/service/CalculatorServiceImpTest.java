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
    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}