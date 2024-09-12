package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures06 {
    public static void main(String[] args) {
        // Using switch and given the values from 1 to 7, print whether it is a business day or weekend
        // Considering 1 as Sunday
        byte day = 1;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
