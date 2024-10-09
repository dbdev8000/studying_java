package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures05 {
    public static void main(String[] args) {
        // print a day of the week, considering 1 as Sunday
        byte day = 5;
        // char, int, byte, short, enum, String

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid gender");
                break;
        }
    }
}
