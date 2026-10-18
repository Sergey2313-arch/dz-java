
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задание 1. Имя и возраст
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Привет, " + name + "!");
        System.out.println("Тебе " + age + " лет.");
        System.out.println("Через 5 лет тебе будет " + (age + 5) + " лет.");

        // Задание 2. Чек в магазине
        String product = sc.nextLine();
        int price = sc.nextInt();
        int count = sc.nextInt();
        sc.nextLine();

        int total = price * count;

        System.out.println("Товар: " + product);
        System.out.println(count + " шт. по " + price + " руб.");
        System.out.println("Итого: " + total + " руб.");

        // Задание 3. Секундомер
        String timerName = sc.nextLine();
        int seconds = sc.nextInt();
        sc.nextLine();

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int sec = seconds % 60;

        System.out.println(timerName + ", " + seconds + " сек = "
                + hours + " ч " + minutes + " мин " + sec + " сек");

        // Задание 4. Визитка
        int personAge = sc.nextInt();
        sc.nextLine();

        String fio = sc.nextLine();
        String city = sc.nextLine();

        System.out.println("=== ВИЗИТКА ===");
        System.out.println("Имя: " + fio);
        System.out.println("Возраст: " + personAge);
        System.out.println("Город: " + city);
        System.out.println("Через 10 лет: " + (personAge + 10));

        sc.close();
    }
}
