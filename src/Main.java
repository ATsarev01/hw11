public class Main {
    public static void main(String[] args) {
        task1();
        printYear(2020);

    }

    public static void task1() {
        System.out.println("Задача 1");
    }
    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }




    }