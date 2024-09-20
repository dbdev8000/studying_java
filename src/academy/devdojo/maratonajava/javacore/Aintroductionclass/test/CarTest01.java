package academy.devdojo.maratonajava.javacore.Aintroductionclass.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclass.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Chevrolet Onix";
        car01.year = 2022;
        car01.model = "LTZ 1.0 Turbo";
        System.out.println("Car 1:");
        System.out.println("Name: " + car01.name + " |Year: " + car01.year + " |Model: " + car01.model);

        System.out.println("-----------------------------------------------------");


        car02.name = "Volkswagen Gol";
        car02.year = 2019;
        car02.model = "1.6 MSI";

        System.out.println("Car 2:");
        System.out.println("Name: " + car02.name + " |Year: " + car02.year + " |Model: " + car02.model);

    }
}
