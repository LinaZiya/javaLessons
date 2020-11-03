package learn.lesson1;

public class Les1 {

    private static float calcExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean checkSum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void determineSign(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + " !");
    }

    public static void determineYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год високосный");
        }
        else if (year % 100 == 0) {
            System.out.println("Год не является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }

    public static void main(String[] args) {
        System.out.println(checkSum(35, 67));
    }
}