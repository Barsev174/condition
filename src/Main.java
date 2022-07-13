public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs = 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        boolean yearTelefon = clientDeviceYear >= 2015;
        if (clientOs == 0) {
            if (yearTelefon) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (yearTelefon) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            }
        }


        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        boolean Visokosniy = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (Visokosniy) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");


        // Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int dayOfDelivery = 1;
        boolean oneCategory = deliveryDistance < 20;
        boolean twoCategory = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeCategory = deliveryDistance >= 60 && deliveryDistance < 100;

        if (oneCategory) {
            System.out.println("Потребуется дней: " + dayOfDelivery);
        } else if (twoCategory) {
            System.out.println("Потребуется дней: " + (dayOfDelivery + 1));
        } else if (threeCategory) {
            System.out.println("Потребуется дней: " + (dayOfDelivery + 2));
        }

        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }


}





