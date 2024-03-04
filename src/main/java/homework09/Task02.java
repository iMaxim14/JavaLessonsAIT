package homework09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 100;
        int randomNumber = numberOne + (int) (Math.random() * numberTwo);
        boolean result = false;
        int numberOfAttempts = 0;
        int maxAttemps = 10;
        System.out.println("Угадайте загаданное число от 0 до 100. У вас: " + maxAttemps + " попыток.");

        while (result == false) {
            System.out.println("Введите число: ");
            int numberThree = scanner.nextInt();
            numberOfAttempts ++;
            if (numberThree == randomNumber){
                result = true;
                System.out.println("Ураа, вы угадали число! Количество попыток: " + numberOfAttempts);
                System.out.println("Хотите повторить?");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("да")){
                    result = false;
                    numberOfAttempts = 0;
                    randomNumber = numberOne + (int) (Math.random() * numberTwo);
                } else {
                    System.out.println("Спасибо за игру!");
                }

            }
            else if (numberThree > randomNumber){
                System.out.println("Подсказка: загаданное число меньше, чем Ваше");
            }
            else if (numberThree < randomNumber){
                System.out.println("Подсказка: загаданное число больше, чем Ваше");
            }
        }
    }
}
