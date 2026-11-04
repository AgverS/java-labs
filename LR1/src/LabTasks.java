import java.util.Scanner;

public class LabTasks {
    LabTasks() {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 - Задание 1, 2 - Задание 2, 3 - Задание 3, 0 - Выход");
            System.out.print("Ваш выбор: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Введите температуру в Кельвинах: ");
                    double kelvin = sc.nextDouble();
                    double celsius = kelvin - 273.15;
                    System.out.println(kelvin + " K = " + celsius + " C");
                    break;
                }
                case 2: {
                    System.out.print("Введите целое число: ");
                    int number = sc.nextInt();
                    boolean delitsyaNa7 = (number % 7 == 0);
                    boolean delitsyaNa11 = (number % 11 == 0);
                    if (delitsyaNa7 && delitsyaNa11) {
                        System.out.println("Число кратно и 7, и 11 одновременно  не подходит");
                    } else if (delitsyaNa7) {
                        System.out.println("Число кратно 7");
                    } else if (delitsyaNa11) {
                        System.out.println("Число кратно 11");
                    } else {
                        System.out.println("Число не кратно ни 7, ни 11");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Введите целое число: ");
                    int number = sc.nextInt();
                    if (number < 0) {
                        number = -number;
                    }
                    int max = 0;
                    while (number > 0) {
                        int digit = number % 10;
                        if (digit > max) {
                            max = digit;
                        }
                        number = number / 10;
                    }
                    System.out.println("Максимальная цифра: " + max);
                    break;
                }
                case 4: {
                    System.out.print("Введите страну: ");
                    String  country =sc.next();
                    switch (country) {
                        case "Беларусь": {
                            System.out.println("Минск");
                        break; }
                        case "Россия": {
                            System.out.println("Москва");
                            break; }
                    }


                    }

                case 0: {
                    System.out.println("Программа завершена.");
                    break;
                }
                default: {
                    System.out.println("Такого пункта меню нет.");
                }
            }
        }
    }
}