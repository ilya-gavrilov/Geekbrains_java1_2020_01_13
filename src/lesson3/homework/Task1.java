package lesson3.homework;

// ЗАДАНИЕ:
// Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
// попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
// указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
// выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


import java.util.Random;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        theGame();
        playAgain();
    }

    public static void theGame () {
        Random random = new Random();
        int randomNum = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру 'Угадай число от 0 до 9'!");
        System.out.println("Для начала коротко опишем правила игры: \n 1. Компьютер загадывает число от 0 до 9 включительно; \n 2. У вас есть 3 попытки, чтобы угадать это число; \n 3. В случае неудачи вы увидите подсказку для следующей попытки; \n 4. После 3х неудачных попыток или после правильного ответа игра заканчивается и вы можете начать её заново. \n \n УДАЧИ!!! \n");
        System.out.println("Введите число от 0 до 9:");

        int numberTry = scanner.nextInt();

        while (numberTry < 0 || numberTry > 9) {
            System.out.println("Введите число от 0 до 9:");
            numberTry = scanner.nextInt();
        }

        for (int i = 0, x = 2; i < 3; i++, x--) {
            String attempt = " попытки!";
            if (x == 1) {
                attempt = " попытка!";
            }
            if (i == 2) {
                System.out.println("YOU LOSE... ;( \n" + "Было загадано число: " + randomNum );
                break;
            }
            if (i < 3) {
                System.out.println("Вы ввели число : " + numberTry);
            }
            if (numberTry < randomNum) {
                System.out.println("Загаданное число больше, чем введенное вами... Осталось " + x + attempt);
            } else if (numberTry > randomNum) {
                System.out.println("Загаданное число меньше, чем введенное вами... Осталось " + x + attempt);
              }
            if (numberTry == randomNum){
                System.out.println("YOU WIN!!! CONGRATULATIONS!!!");
                break;
            }
            numberTry = scanner.nextInt();
        }
    }

    public static void playAgain () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Для повторной игры введите '1'. \n Для завершения игры введите '0'.");
        int morePlay = scanner.nextInt();

        while (morePlay < 0 || morePlay > 1) {
            System.out.println("\n Для повторной игры введите '1'. \n Для завершения игры введите '0'.");
            morePlay = scanner.nextInt();
        }

        switch (morePlay) {
            case (1):
                theGame();
                playAgain();
                break;
            case (0):
                System.out.println("Спасибо за игру. До свидания!");
                break;
        }
    }
}
