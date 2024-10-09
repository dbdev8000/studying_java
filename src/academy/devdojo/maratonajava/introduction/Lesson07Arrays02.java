package academy.devdojo.maratonajava.introduction;

public class Lesson07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float and double 0
        // char '|u0000' ' '
        //boolean false
        // String null

        String[] names = new String[4];

        names[0] = "Sanji";
        names[1] = "Zoro";
        names[2] = "Luffy";
        names[3] = "Nami";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
