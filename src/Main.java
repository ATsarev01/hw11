import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        printYear(2020);
        task2();
        printVersion(0, 2020);
        task3();
        printInfoAboutDistance(20);
    }

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void printVersion(int os, int yearProduction) {
        if (os != 1 && os != 0) {
            System.out.println("ОС должна равняться 0 или 1");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        String result = "Нужно установить ";
        if (yearProduction < currentYear) {
            result = result + "облегченную версию для ";
        } else {
            result = result + "обычную версию для ";
        }
        if (os == 0) {
            result = result + "iOS";
        } else {
            result = result + "Android";
        }
        System.out.println(result);

    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    private static int calculateDeliveryDays (int distance) {
        if (distance < 0 || distance > 100) {
            return -1;}
        if (distance <= 20) {
            return 1;
        }
        if (distance <= 60) {
            return 2;
        } else {
            return 3;
        }

    }

    private static void printInfoAboutDistance(int  distance) {
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays == -1) {
            System.out.printf("Доставка не осуществляется");
        } else {
            System.out.println("Кол-во дней доставки - " + deliveryDays);
    }
    }
}
