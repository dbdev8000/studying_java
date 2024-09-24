package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 0);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers02(20, 0));
        System.out.println("---------------------------");
        calculator.printsDivisionTwoNumbers(20, 0);
    }
}
