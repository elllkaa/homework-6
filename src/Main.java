public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задача 1");

        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла" + i);
        }

        // Задание 2
        System.out.println("Задача 2");
        for (int i = 10; i >=1; i--) {
            System.out.println("Итерация цикла" + i);
        }

        // Задание 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла" + i);
        }

        // Задание 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10 ; i--) {
            System.out.println("Итерация цикла" + i);
        }

        // Задание 5
        System.out.println("Задача 5");
        for (int year = 1904; year < 2096; year++) {
            if( year % 4 ==0 && year % 100 !=0 || year % 400 ==0)
            System.out.println(year+ " год является високосным");
        }

        // Задание 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i += 7) {
            System.out.println(i);
        }

        // Задание 7
        System.out.println("Задача 7");
        for (int i = 1; i <=512 ; i = i * 2) {
            System.out.println(i);
        }

        // Задание 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
        }
        System.out.println(total);

        // Задание 9
        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 +salary1;
            System.out.println("Месяц " + i + " Итого " + total1);
        }
        System.out.println(total1);

        // Задание 10
        System.out.println("Задача 10");
        int number= 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(  number + "*" + i + "=" + number * i);
        }

    }

}