package homework12;

import java.util.Scanner;

/*
Напишите программу на Java, которая демонстрирует работу с методами.
Ваша программа должна включать метод calculateArea, который принимает в качестве аргументов
 значения типа double: длину и ширину прямоугольника, и возвращает значение его площади.
 Также должен быть реализован метод calculatePerimeter, принимающий те же аргументы и возвращающий
 периметр прямоугольника. Главный метод (main) должен считывать значения длины и ширины, переданные пользователем,
вызывать оба эти метода для расчета площади и периметра, и выводить результаты расчетов на экран.
 */
public class Task01 {
    public static void main(String[] args) {
        double area;
        double perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину в см: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Ошибка. Введите число");
            scanner.next();
        }
        double length = scanner.nextDouble();
        System.out.println("Введите ширину в см: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Ошибка. Введите число");
            scanner.next();
        }
        double width = scanner.nextDouble();
        System.out.println("Площадь равна: " + calculateArea(length, width) + " см");
        System.out.println("Периметр равен: " + calculatePerimeter(length, width) + " см");
        scanner.close();
    }
    public static double calculateArea(double meaningOne, double meaningTwo){
        if(meaningOne <= 0 || meaningTwo <=0){
            System.out.println("Ошибка, введены некорретные значения");
            return  -1;
        }
        return meaningOne * meaningTwo;

    }
    public static double calculatePerimeter(double meaningOne, double meaningTwo){
        if(meaningOne <= 0 || meaningTwo <=0){
            System.out.println("Ошибка, введены некорретные значения");
            return  -1;
        }
        return (meaningOne + meaningTwo) * 2;
    }
}
