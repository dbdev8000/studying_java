package academy.devdojo.maratonajava.javacore.Aintroductionclass.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclass.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Rayleigh";
        teacher.age = 78;
        teacher.gender = 'M';

        System.out.println("Name: " + teacher.name + " Age: " + teacher.age + " Gender: " + teacher.gender);

    }
}
