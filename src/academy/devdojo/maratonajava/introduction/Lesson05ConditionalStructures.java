package academy.devdojo.maratonajava.introduction;

import java.sql.SQLOutput;

public class Lesson05ConditionalStructures {
    public static void main(String[] args) {
        int age = 20;
        boolean isAutorizedBuyAlcoholicDrink = age > 18;
        //!
        if (isAutorizedBuyAlcoholicDrink) {
            System.out.println("inside the if");
        }
        System.out.println("outside the if");
    }
}
