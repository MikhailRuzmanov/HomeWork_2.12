package pro.sky.skyprospringtest.Homework212.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImpTestParametrs {
    private final CalculatorService calculatorService = new CalculatorServiceImp();

    @ParameterizedTest
    @MethodSource("plusGoodParamsForTest")
    void plusGood (Integer num1, Integer num2,Integer expected){
        assertEquals(expected, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> plusGoodParamsForTest(){
        return Stream.of(
                Arguments.of(5,4,9),
                Arguments.of(54,3,57),
                Arguments.of(8,3,11),
                Arguments.of(9,7,16)
        );

    }
}
