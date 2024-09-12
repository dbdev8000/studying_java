package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures03 {
    public static void main(String[] args) {
        // Donate if salary > 5000
        double salary = 1400;
        //(condition) ? true : false

        String result = salary > 5000 ? "I will donate 500 to DevDojo" : "I still don't have the conditions but I will have!";

        System.out.println(result);


    }
}
