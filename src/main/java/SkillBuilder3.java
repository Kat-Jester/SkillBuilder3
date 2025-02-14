/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    private static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        for (int i = 0; i < numOfTimesToRepeat; i++) {
            result += s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                str += " ";
            }
            for (int j = 1; j <= i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String circle(int radius){
        String str = "";

        for (int y = radius - 1; y >= -radius + 1; y--) {
            int x = (int) Math.sqrt(radius * radius - y * y);
            int spaces = radius - x;
            int stars = 2 * x;

            str += " ".repeat(spaces) + "*".repeat(stars) + "\n";
        }

        return str;
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

    public static boolean isPerfect(long number){
        return sumOfDivisors(number) == number && number != 0;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        return sum;
    }
}
