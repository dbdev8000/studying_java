package academy.devdojo.maratonajava.introduction;

public class Lesson02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 1000000000000000000L;
        long bigNumber = (long) 155.60;
        double salaryDouble  = 2000.0D;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 55;
        // String is not a primitive type

        String onePiece = "One Piece";

        System.out.println("Age is " + age + " years old" + "\nYes! the man is so old or so young");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char: " + character);
        System.out.println(bigNumber);

        System.out.println("The " +onePiece+ " is real!");

        // Casting is not such a good way to do this
        // It's better to change the primitive type of the variable


    }
}

