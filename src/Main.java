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

    public static void versionDetection(int deviceYear, int clientOS1) {
        int currentYear = LocalDate.now().getYear();

        if (deviceYear < 1900 || deviceYear > currentYear) {
            throw new IllegalArgumentException("Некорректный год устройства: " + deviceYear);
        }

        if (clientOS1 < 0 || clientOS1 > 1) {
            throw new IllegalArgumentException("Некорректная ОС: " + clientOS1);
        }

        if (clientOS1 == 0 && currentYear < deviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && currentYear > deviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 1 && currentYear > deviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println();
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1; // Доставка в пределах 20 км занимает сутки
        } else if (distance <= 60) {
            return 2; // Доставка от 20 до 60 км занимает 2 дня
        } else if (distance <= 100) {
            return 3; // Доставка от 60 до 100 км занимает 3 дня
        } else {
            return -1; // Доставка свыше 100 км невозможна
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2549;
        searchBissextileYear(year);

        System.out.println("Задание №2");
        int deviceYear = 2020;
        int clientOS1 = 0;
        versionDetection(deviceYear, clientOS1);

        System.out.println("Задание №3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}