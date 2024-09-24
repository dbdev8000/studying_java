package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        StudentPrinter printer = new StudentPrinter();


        student01.name = "Nami";
        student01.age = 20;
        student01.gender = 'F';

        student02.name = "Chopper";
        student02.age = 17;
        student02.gender = 'M';

        printer.print(student01);
        printer.print(student02);

    }
}
