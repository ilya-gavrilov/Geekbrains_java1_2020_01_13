package lesson1;

public class Lesson1 {
    public static void main(String[] args) { //Пункт 1 домашнего задания.
        // Пункт 2 домашнего задания >>>>>>>>>
        byte by = 127;
        short sh = 32767;
        int in = 2147483647;
        long lo = 9223372036854775807L;
        float fl = 3.141592f;
        double dou = -3.141592;
        char ch = '*';
        boolean bo = false;
        String str = "Тестовая строка.";
        //  <<<<<<<<<<<<<<<   Пункт 2 домашнего задания.

        System.out.println(calculate(1.14f, 2.19f, 4.17f, 3.11f));//Пункт 3 домашнего задания.

        System.out.println(between10and20(8, 12)); //Пункт 4 домашнего задания.

        isPositiveOrNegative(0); //Пункт 5 домашнего задания.

        System.out.println(isNegative(0)); //Пункт 6 домашнего задания.

        greetings("Наставник"); //Пункт 7 домашнего задания.
    }

    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static boolean between10and20 (int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative (int x){
        if (x >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative (int y) {
        if (y < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greetings (String name) {
        System.out.println("Привет, " + name + "!");
    }
}
