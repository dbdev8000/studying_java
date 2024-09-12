package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures04Exercise {
    public static void main(String[] args) {
        // 0 | 34,712 | 9.70%
        // 34,713 | 68,507 | 37.35%
        // 68,508 | 49.50%

        double annualSalary = 35000;
        double first = 9.70 / 100;
        double second = 37.35 / 100;
        double third = 49.50 / 100;
        double taxValue;
        if (annualSalary <= 34712) {
            taxValue = annualSalary = annualSalary * first;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxValue = annualSalary *= second;
        } else {
            taxValue = annualSalary *= third;
        }
        System.out.println(taxValue);
    }
}
