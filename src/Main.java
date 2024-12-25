public class Main {
    public static void main(String[] args) {
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке. ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке. ");
        }
        System.out.println();


        int clientDeviceYear = 2012;
        int clientOS1 = 0;
        if (clientOS1 == 0 & clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке. ");
        } else if (clientOS1 == 0 & clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке. ");
        } else if (clientOS1 == 1 & clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке. ");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке. ");
        }
        System.out.println();


        int year = 2549;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является высокосным годом.");
        } else {
            System.out.println(year + " не является высокосным годом.");
        }
        System.out.println();


        int deliveryDistance = 95;
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
        System.out.println();


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(" 1-й месяц Январь принадлежит к сезону Зима ");
                break;
            case 2:
                System.out.println(" 1-й месяц Февраль принадлежит к сезону Зима ");
                break;
            case 3:
                System.out.println(" 1-й месяц Март принадлежит к сезону Весна ");
                break;
            case 4:
                System.out.println(" 1-й месяц Апрель принадлежит к сезону Весна ");
                break;
            case 5:
                System.out.println(" 1-й месяц Май принадлежит к сезону Весна ");
                break;
            case 6:
                System.out.println(" 1-й месяц Июнь принадлежит к сезону Лето ");
                break;
            case 7:
                System.out.println(" 1-й месяц Июль принадлежит к сезону Лето ");
                break;
            case 8:
                System.out.println(" 1-й месяц Август принадлежит к сезону Лето ");
                break;
            case 9:
                System.out.println(" 1-й месяц Сентябрь принадлежит к сезону Осень ");
                break;
            case 10:
                System.out.println(" 1-й месяц Октябрь принадлежит к сезону Осень ");
                break;
            case 11:
                System.out.println(" 11-й месяц Ноябрь принадлежит к сезону Осень ");
                break;
            case 12:
                System.out.println(" 12-й месяц Декабрь принадлежит к сезону Зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует. ");
        }
    }
}