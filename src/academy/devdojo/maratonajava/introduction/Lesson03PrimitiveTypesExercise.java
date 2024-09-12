package academy.devdojo.maratonajava.introduction;

/*
Pratice

Create variables for the fields described below between and print the following message:

I <name>, living at the address <address>
I confirm that I received the salary of <salary>, on the date <date>
 */
public class Lesson03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Luffy";
        String address = "Foosha Valley";
        double salary = 1999.99;
        String date = "25 of April";

        System.out.println("I " + name + ", living at the address " + address);
        System.out.println("I confirm that I received the salary of " + salary +
                ", on the date " + date);

    }
}
