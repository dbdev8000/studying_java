package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Shinji";
        employee.salary = new double[]{1500, 846, 990};
        employee.age = 14;


        employee.print();
    }
}
