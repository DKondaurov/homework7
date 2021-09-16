package pro.sky.java.course1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void checkTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный ");
        } else System.out.println("Год не високосный");
    }

    private static void checkingDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            System.out.print("Установите lite-версию приложения");
        } else System.out.print("Установите обычную-версию приложения");
        switch (clientOS) {
            case 0:
                System.out.println(" для Android по ссылке.");
                break;
            case 1:
                System.out.println(" для iOS по ссылке.");
        }
    }

    private static int deliveryTime(int deliveryDistance) {
        int time = 0;
        if (deliveryDistance <= 20) {
            time = 1;
        } else if (deliveryDistance <= 60) {
            time = 2;
        } else if (deliveryDistance <= 100) {
            time = 3;
        }
        return time;
    }

    private static void searchForDuplicates(String letters) {
        char[] symbol = letters.toCharArray();
        boolean interrupter = true;
        for (int i = 0; i < letters.length(); i++) {
            for (int i2 = i + 1; i2 < letters.length() && interrupter; i2++) {
                if (symbol[i] == symbol[i2]) {
                    System.out.println("Символ " + symbol[i2] + " дублируется в строке!");
                    interrupter = false;
                }
            }
        }
        if (interrupter) {
            System.out.println("Дублей нет");
        }
    }

    private static void arrayOpposite(int[] array) {
        for (int start = 0, finish = array.length - 1; start < finish; start++, finish--) {
            int variable = array[start];
            array[start] = array[finish];
            array[finish] = variable;
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    private static int totalAmount(int[] arr) {
        int amountPayments = 0;
        for (int i = 0; i < arr.length; i++) {
            amountPayments += arr[i];
        }
        return amountPayments;
    }

    private static float averageAmount(int[] arr, int amountPayments) {
        float averageExpenditure = 0f;
        averageExpenditure = amountPayments / arr.length;
        return averageExpenditure;
    }

    public static void main(String[] args) {
        // Задание 1
        task1();
        // Задание 2
        task2();
        // Задание 3
        task3();
        // Задание 4
        task4();
        // Задание 5
        task5();
        // Задание 6
        task6();


    }

    private static void task6() {
        int[] arr = generateRandomArray();
        int amountPayments = totalAmount(arr);
        float averageExpenditure = averageAmount(arr, amountPayments);
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenditure + " рублей.");
    }

    private static void task5() {
        int[] array = {3, 2, 1, 6, 5};
        arrayOpposite(array);
        System.out.println(Arrays.toString(array));
    }

    private static void task4() {
        String letters = "aabccddefgghiijjkk";
        searchForDuplicates(letters);
    }

    private static void task3() {
        int deliveryDistance = 95;
        int time = deliveryTime(deliveryDistance);
        System.out.println("Delivery time " + time + " day");
    }

    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkingDevice(clientOS, clientDeviceYear);
    }

    private static void task1() {
        int year = 2021;
        checkTheYear(year);
    }
}
