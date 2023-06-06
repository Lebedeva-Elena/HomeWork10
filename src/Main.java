import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        checkYearIsLeap(2024);

        task2();
        recommendVersion(0,2023);

        task3();
        int deliveryDays = calculateDeliveryDays(105);
        System.out.println("Время доставки займет " + deliveryDays + " дней");

    }

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void checkYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год высокосный");
        } else {
            System.out.println(year + " год невысокосный");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void recommendVersion(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        int iOs = 0;
        int android = 1;

        if (clientOs == iOs) {
            if (clientOs >= clientYear) {
                System.out.println("Установите обычную версию для iOs");
            } else {
                System.out.println("Установите облегченную версию для iOs");

            }
        } else if (clientOs == android) {
            if (clientOs >= clientYear) {
                System.out.println("Установите обычную версию для android");
            } else {
                System.out.println("Установите облегченную версию для android");

            }
        } else {
            System.out.println("Извините, для вашего телефона версии нет");
        }

    }


    public static void task3() {
        System.out.println("Задача 3 ");
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = -1;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else if (distance > 100) {
            deliveryDays = 0;
        }
        return deliveryDays;

    }
}


