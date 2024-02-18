package homework09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        boolean process = true;


        while (process) {
            System.out.println("Какую операции хотели бы выполнить? 1. Прибавление 2. Вычитание 3. Умножение 4. Деление");
            int operation = scanner.nextInt();
            System.out.println("Введите два числа для вычисления: ");
            double numberOne = scanner.nextDouble();
            double numberTwo = scanner.nextDouble();
            while (operation > 4){
             {
                System.out.println("Ошибка, при выборе операции введите 1,2,3 или 4");
                operation = scanner.nextInt();
                 System.out.println("Введите два числа для вычисления: ");
                 numberOne = scanner.nextDouble();
                 numberTwo = scanner.nextDouble();
            }
            }
            if (operation == 1) {
                result = numberOne + numberTwo;
                System.out.println(result);
            } else if (operation == 2) {
                result = numberOne - numberTwo;
                System.out.println(result);
            } else if (operation == 3) {
                result = numberOne * numberTwo;
                System.out.println(result);
            } else if (operation == 4) {
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                    System.out.println(result);

                } else {
                    while (numberTwo == 0) {
                        System.out.println("Ошибка!!! На ноль делить нельзя! Повторите ввод второго числа: ");
                        numberTwo = scanner.nextDouble();
                        result = numberOne / numberTwo;
                        System.out.println(result);

                    }

                }

                }
            System.out.println("Хотите ещё?");
            String oneMore = scanner.next();
            if (oneMore.equalsIgnoreCase("нет")) {
                process = false;
                System.out.println("Конец");
            }
            scanner.close();
        }
    }
}
