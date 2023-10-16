import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
         task1();
         task2();
         task3();
    }

    public static void task1() throws Exception {
        System.out.println("Задание 1");
        System.out.println("Введите год:");
        int year = inputInteger();
        leapCheck(year);
    }

    public static void task2() throws Exception {
        System.out.println("Задание 2");
        System.out.println("Какая у вас ОС? \n 0 - iOS \n 1 - Android");
        int osId = inputInteger();
        System.out.println("Введите год выпуска девайса:");
        int yearOfDeviceIssue = inputInteger();
        recommendationWhichApplicationToInstall(osId, yearOfDeviceIssue);
    }

    public static void task3() throws Exception{
        System.out.println("Задание 4");
        System.out.println("Введите расстояние в км");
        int distance = inputInteger();
        determiningDeliveryTime(distance);
    }
    public static int inputInteger() throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(buffer.readLine());
    }
    public static void leapCheck(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (year < 1584) {
            System.out.printf("В %d году високосный год ещё не был введён \n", year);
        } else if (leapYear) {
            System.out.printf("%d год является високосным \n", year);
        } else {
            System.out.printf("%d год не является високосным \n", year);
        }
        System.out.println();
    }
    public static void recommendationWhichApplicationToInstall(int osId, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        if (yearOfIssue < currentYear) {
            switch (osId) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (osId) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
        System.out.println();
    }
    public static void determiningDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставка не производится на растояние свыше 100км");
        }
        System.out.println();
    }
}


