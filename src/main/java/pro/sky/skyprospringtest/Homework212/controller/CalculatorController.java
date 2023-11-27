package pro.sky.skyprospringtest.Homework212.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyprospringtest.Homework212.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    @GetMapping
    public String welcome(){
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2){
        Integer result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2){
        Integer result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2){
        Integer result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2){
        Double result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String divideByZero(IllegalArgumentException e, HttpServletResponse response) {
        response.setStatus(400);
        return e.getMessage();
    }

}
