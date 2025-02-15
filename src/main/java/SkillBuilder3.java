/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3 {
    private static String repeat(String s, int numOfTimesToRepeat) {
        String result = "";
        for (int i = 0; i < numOfTimesToRepeat; i++) {
            result += s;
        }
        return result;
    }

    public static String leftRightTriangle(int height) {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += "*".repeat(i) + "\n";
        }
        System.out.println("");
        return str;
    }

    public static String rightRightTriangle(int height) {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += " ".repeat(height - i) + "*".repeat(i) + "\n";
        }
        return str;
    }

    public static String circle(int radius) {
        StringBuilder str = new StringBuilder();

        for (int y = radius - 1; y >= -radius + 1; y--) {
            int x = (int) Math.sqrt(radius * radius - y * y);
            int spaces = radius - x;
            int stars = 2 * x;

            str.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
        }

        return str.toString();
    }


    public static long sumOfDivisors(long number) {
        long sum = 0;
        for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(long number) {
        return sumOfDivisors(number) == number && number != 0;
    }

    public static long sumOfDivisorsUsingWhile(long number) {
        long sum = 0;
        long i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
