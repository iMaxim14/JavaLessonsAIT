package homework14;

import java.util.Arrays;
import java.util.Scanner;

public class HobbysArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hobby = {"футбол", "рисование", "музыка", "книги"};
        //Задача 1: Список хобби
        System.out.println(hobby[1]);

        //Задача 2: Поиск хобби
        boolean found = false;
        for (String hobbySearch : hobby) {
            if (hobbySearch.equals("рисование".toLowerCase())) {
                found = true;
            }
        }
        System.out.println(found ? "Совпадения найдены" : "Совпадения не найдены");
        //Задача 3: Любимое хобби
        System.out.println("Введите номер любимого хобби: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int numberOfHobby = scanner.nextInt();

       if (numberOfHobby < 1 || numberOfHobby > 4) {
            System.out.println("Ошибка!! Значения неверны");
        }
        System.out.println("Ваше любимое хобби: " + hobby[numberOfHobby - 1]);

        //Задача 4: Добавление хобби
        String[] hobbyNew = new String[7];
        System.arraycopy(hobby, 0, hobbyNew, 0, 4);
        hobbyNew[4] = "плаванье";
        hobbyNew[5] = "рыбалка";
        System.out.println("Введите Ваш вариант хобби: ");
        while (scanner.hasNextInt()) {
            System.out.println("Ошибка, введите данные без использования цифр: ");
            scanner.next();
        }
        hobbyNew[6] = scanner.next();
        System.out.println("Hobby: " + Arrays.toString(hobbyNew));

        //Задача 5: Рейтинг хобби
        int[] ratingOfHobby = {1, 2, 3, 4};
        System.out.println("Рейтинг хобби: ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.println( + ratingOfHobby[i] + "." + hobby[i]);
        }
    }
}

