package academy.devdojo.maratonajava.introduction;

public class Lesson06RepetitionStructure03 {
    // Print the first 25 numbers of a given value, for example 50
    public static void main(String[] args) {
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
