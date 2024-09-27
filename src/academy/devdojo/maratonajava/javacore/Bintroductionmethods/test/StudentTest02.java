package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Nami";
        student01.age = 20;
        student01.gender = 'F';

        student02.name = "Chopper";
        student02.age = 17;
        student02.gender = 'M';

        student01.print();
        student02.print();
    }
}
