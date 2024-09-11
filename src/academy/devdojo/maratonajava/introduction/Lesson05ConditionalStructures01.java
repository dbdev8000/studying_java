package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAutorizedBuyAlcoholicDrink = age > 18;
        //!
        if (isAutorizedBuyAlcoholicDrink != false) {
            System.out.println("Authorized to buy alcoholic drinks");
        }else {
            System.out.println("Not authorized to purchase alcoholic beverages");
        }

        if (!isAutorizedBuyAlcoholicDrink) {
            System.out.println("Not authorized to purchase alcoholic beverages");
        }
        System.out.println("outside the if");
    }
}
