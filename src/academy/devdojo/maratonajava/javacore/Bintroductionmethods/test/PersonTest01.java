package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "Punpun";
        person.setName("Punpun");
//        person.age = 22;
        person.setAge(22);

//        person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
