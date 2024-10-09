package academy.devdojo.maratonajava.javacore.Aintroductionclass.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclass.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 19;
        student.gender = 'M';
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Gender: " + student.gender);
    }
}
