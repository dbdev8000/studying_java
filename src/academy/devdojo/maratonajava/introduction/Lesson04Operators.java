package academy.devdojo.maratonajava.introduction;

public class Lesson04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println("value: " + result);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDiffTen = 10 != 10;

        System.out.println("isTenGreaterThanTwenty: " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty: " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty: " + isTenEqualsTwenty);
        System.out.println("isTenEqualsTen: " + isTenEqualsTen);
        System.out.println("isTenDiffTen: " + isTenDiffTen);

        // && (AND) ||(OR) !(NOT)

        int age = 20;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age > 30 && salary > 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isWithinTheLawGreaterThanThirty: " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty: " + isWithinTheLawLessThanThirty);

        double totalValueChekingAccount = 200;
        double totalValueBitcoin = 5000;
        float valuePlaystationFive = 5000F;
        boolean isPlaystationFiveBuyable = totalValueChekingAccount > valuePlaystationFive ||
                totalValueBitcoin > valuePlaystationFive;

        System.out.println("isPlaystationFiveBuyable: " + isPlaystationFiveBuyable);

        // += -= *= %= /=

        double bonus = 1800; // 1800
        bonus += 1000; // bonus = bonus + 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        //
        int counter = 0;
        counter += 1; // counter = counter + 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        int counter2 = 0;

        System.out.println(counter2++);
        System.out.println(counter2);
    }
}
