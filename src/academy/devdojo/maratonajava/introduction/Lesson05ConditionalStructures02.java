package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures02 {
    public static void main(String[] args) {

        int age = 16;
        String category;

        if (age < 15) {
            category = "Children's category";
        } else if (age >= 15 && age < 18) {
            category = "Youth category";
        } else {
            category = "Adult category";
        }
        System.out.println(category);

        //category = age < 15 ? "Children's category" : age >= 15 && age < 18 ? "Youth category : Adult category";
        //System.out.println(category);
    }
}
