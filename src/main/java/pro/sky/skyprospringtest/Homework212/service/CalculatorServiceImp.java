package pro.sky.skyprospringtest.Homework212.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService{
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1*num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2==0) throw new IllegalArgumentException("Нельзя делить на ноль");
        return num1.doubleValue()/num2.doubleValue();
    }
}
