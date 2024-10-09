package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractsTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printsDivisionTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("There is no division by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 77;
        number2 = 55;
        System.out.println("inside the changeTwoNumbers");
        System.out.println("Num1 " + number1);
        System.out.println("Num2 " + number2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
