package first.app;

//public --> модификатор доступа, класс общедоступный
public class MyApp {

    //# < >  +  -  ,  .  :  ;  ( ) { } / \

    //void --> метод ничего не возвращает
    //main --> название метода
    //(String[] args) --> параметры (аргументы) метода
    //(...) --> тело метода

    /*
    void --> метод ничего не возвращает
    main --> название метода
    (String[] args) --> параметры (аргументы) метода
    (...) --> тело метода
     */



        //целочисленные переменные
        //-128 до 128 1байт(вместимость хранилища)
        static byte age = 42;

        //-32768 до 32767 2байта
        static short preis = 10000;

        //-2147483648 bis 2147483648 4байта
         static int number = 200000;

        //-9223372036854775808 до -9223372036854775807 8байт
        static long bigNumber = 3434343434343L;

        //числа с плавающими точками (десятичные)
        static float euroPreis = 0.85f;

        static double dollarPreis = 0.85;

        //символы (переменные)
        //буквы
        static char charLetter = 'A';

        //да или нет
        static boolean result = true;

        //Тестовые выражения
        static String text = "Hello";




    public static void main(String[] args) {
        //Тело метода
        System.out.println("Возраст "+ age);
        System.out.print("Курс валюты евро/доллар "+ euroPreis);
    }
}
