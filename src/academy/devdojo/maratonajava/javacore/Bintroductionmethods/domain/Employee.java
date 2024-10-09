package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double salary : salary) {
            System.out.print(salary + " ");

        }
        printAverageSalary();
    }

    public void printAverageSalary() {
        if (salary == null) {
            return;
        }
        double average = 0;
        for (double salary : salary) {
            average += salary;
        }
        average /= salary.length;
        System.out.println("\nAverage salary: " + average);
    }
}
