package homework11;

import java.util.Scanner;

public class CarDatabase {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите марку автомобился: ");
        String carBrand = scanner.next().trim();
        System.out.println("Введите год выпуска: ");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка, введите год");
            scanner.next();
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()){
            case "ford":
                countryOfOrigin = "США";
                    carInfo = year < 1990 ? "Популярны спортивные модели" : "Большой популярностью пользуются семейные модели";
                break;
            case "volkswagen":
                countryOfOrigin = "Германия";
                carInfo = year < 1990 ? "Автомобили по доступным ценам. Набирает популярность модель Гольф ": "Надеждые, хорошие автомобили в соотношение цена/качество";
                break;
            case "toyota":
                countryOfOrigin = "Япония";
                carInfo = year < 1990 ? "Популярна модель Corona. Особенно хорошо продавались на территории США" : "Популярны малолитражные автомобили, пользуюьтся большим спросом";
                break;
            case "fiat":
                countryOfOrigin = "Италия";
                carInfo = year < 1990 ? "Популярны такие модели как ПАНДА и ТИМПО" : "Пользуется спросом новый семейный внедорожник, созданные в сотрудничестве с компанией Chrysler";
                break;

            default:
                countryOfOrigin = "Не найдена";
                carInfo = "Нет информации";
                break;
        }
        printCarData(countryOfOrigin,carInfo);
    }
    public static void printCarData (String country, String info){
        System.out.println("Страна производитель " + country);
        System.out.println("Дополнительная информация: " + info);
    }
}
