import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //ввёл ввод с клавиатуры для более простой проверки кода

        //Задача 1
        System.out.println("Введите номер вашей OS Android-1 или IOS-0 ");
        int choiceOS = scanner.nextInt();  //Ввод, выбор OS клиента
        byte clientOS = 0;                // IOS
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке: WWW.IOS_DeleteFromRussia.ru");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: WWW.Android-DeleteFromRussia.ru");
        }else {
            System.out.println("Нет такого варианта");
        }

        //задача 2.
        System.out.println("Введите номер вашей OS Android-1 или IOS-0 ");
        int choice = scanner.nextInt();                                //выбор OS клиента
        System.out.println("Введите год выпуска вашего телефона- "); //Запрос года выпуска телефона
        int clientDeviceYear = scanner.nextInt();                   //ввод года выпуска телефона

        if (choice == clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке: WWW.IOS_DeleteFromRussia.ru");
        } else if (choice == clientOS && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: WWW.IOS_DeleteFromRussiaPlease.ru ");
        }
        else if (choice == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: WWW.Android-DeleteFromRussia.ru");
        } else if (choice == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: WWW.Android-DeleteFromRussiaPlease.ru");
        } else {
            System.out.println("Введены некоректные данные, проверьте данные");
        }

        //Задача 3
        System.out.println("Введите год для проверки");
        int year = scanner.nextInt(); // Введите интересующий вас год

        if (year < 1584) {
            System.out.println("Год должен быть не меньше 1584");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача 4
        System.out.println("Введите расстояние :");
        int km = scanner.nextInt(); // Введите Расстояние
        if (km <= 20) {
            System.out.println("Потребуется суток на доставку: 1");
        } else if (km > 20 && km <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (km >= 60 && km <= 100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Свыше 100 км доставки нет! ");
        }

        //Задача 5
        System.out.println("Введите номер месяца :");
        int monthNumber = scanner.nextInt(); // Введите интересующий вас год
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        scanner.close(); //закрытие ввода с клавиатуры, применил везде один.
    }
}

