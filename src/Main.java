

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //1
        int leapYear = 2020;
        int notLeapYear = 2021;
        checkIsYearLeap(leapYear);
        checkIsYearLeap(notLeapYear);

        //2
        int year = LocalDate.now().getYear();
        int os = 0;
        suggestVersion(os, year);

        //3
        int deliveryDistance = 1;
        printDeliveryInfo(deliveryDistance);
        printDeliveryInfo(deliveryDistance);
        printDeliveryInfo(deliveryDistance);
    }

    public static void checkIsYearLeap(int year){
         if(year % 4 != 0 || (year % 100 == 0 && year % 400 !=0)){
             System.out.println(year + "Год не является высокосным\n");
         }else {
             System.out.println(year + "Год является высокосным\n");
         }
    }
    public static void suggestVersion(int os, int year){
        int borderYear = 2015;
        if (os == 0 && year < borderYear){
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        }else if (os == 0 && year >= borderYear){
            System.out.println("Установите версию приложения для ios по ссылке");
        }else if (os == 1 && year < borderYear){
            System.out.println("Установите версию приложения для android по ссылке");
        }else if (os == 1 && year >= borderYear){
            System.out.println("Установите версию приложения для android по ссылке");
        }else {
            System.out.println("Не удалось определить версию");
        }
    }
    public static void printDeliveryInfo(int deliveryDistance){
        int deliveryDays = getDeliveryDays(deliveryDistance);
        if (deliveryDays == -1){
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется %s дней" + deliveryDays);
        }
        System.out.println();
    }

    public static int getDeliveryDays(int deliveryDistance){
        if (deliveryDistance < 20){
            return 1;
        }else  if (deliveryDistance <= 60){
            return 2;
        }else if (deliveryDistance < 100){
            return  3;
        }else {
            return -1;
        }
    }
}







