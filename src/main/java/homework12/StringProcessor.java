package homework12;

/*
Разработайте класс StringProcessor, который будет
предоставлять статические методы для работы со строками:

1. Метод reverseString, который принимает строку и возвращает
её в перевёрнутом виде.
2. Метод isPalindrome, который проверяет, является ли переданное слово палиндромом (читается одинаково в обоих направлениях). Метод должен возвращать булево значение.
 */
public class StringProcessor {
    public static void main(String[] args) {
        String word = "Казак".toLowerCase();
        String wordTwo = "";
        System.out.println("Слово \"" + word + "\" наоборот: " + reverseString(word, wordTwo));
        System.out.println("Является ли слово палидромом: " + (isPalindrome(word, wordTwo) ? "Да" : "Нет"));
    }
    public static String reverseString(String meaningOne, String meaningTwo){
        for (int i = meaningOne.length() - 1; i >= 0; i--){
            meaningTwo += meaningOne.charAt(i);
        }
        return meaningTwo;
    }

    public static boolean isPalindrome (String meaningOne, String meaningTwo){
        for (int i = meaningOne.length() - 1; i >= 0; i--){
            meaningTwo += meaningOne.charAt(i);
        }
        if (meaningOne.equals(meaningTwo)){
            return true;
        }
        else {
            return false;
        }
    }
}
