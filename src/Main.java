import java.time.LocalDate;

public class Main {
    public static void searchBissextileYear(int year) {
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является высокосным годом.");
        } else {
            System.out.println(year + " не является высокосным годом.");
        }
        System.out.println();
    }

    public static void versionDetection(int currentYear, int clientOS1) {

        if (clientOS1 == 0 & currentYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке. ");
        } else if (clientOS1 == 0 & currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке. ");
        } else if (clientOS1 == 1 & currentYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке. ");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке. ");
        }
        System.out.println();
    }

    public static void bankCardDelivery(int deliveryDistance) {

        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет. ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание №1");
        int year = 2549;
        searchBissextileYear(year);

        System.out.println("Задание №2");
        int currentYear = LocalDate.now().getYear();
        int clientOS1 = 0;
        versionDetection(currentYear, clientOS1);

        System.out.println("Задание №3");
        int deliveryDistance = 95;
        bankCardDelivery(deliveryDistance);
    }
}