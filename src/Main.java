import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1. Чётное или нечётное число
        System.out.println("=== ЗАДАНИЕ 1 ===");

        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            if (n % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечётное");
            }
        }

        // Задание 2. Проверка пароля без массивов
        System.out.println("\n=== ЗАДАНИЕ 2 ===");
        scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        boolean hasDigit = false;
        boolean hasUpper = false;
        int vowels = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }

            char lower = Character.toLowerCase(c);
            if ("аеёиоуыэюя".indexOf(lower) != -1) {
                vowels++;
            }
        }

        System.out.println("Есть цифра: " + hasDigit);
        System.out.println("Есть заглавная буква: " + hasUpper);
        System.out.println("Количество гласных: " + vowels);

        if (hasDigit && hasUpper) {
            System.out.println("Пароль надёжный");
        } else {
            System.out.println("Слабый");
        }

        // Задание 3. Длина окружности и площадь круга
        System.out.println("\n=== ЗАДАНИЕ 3 ===");

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double length = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Длина окружности: " + length);
        System.out.println("Площадь круга: " + area);

        // Задание 4. Перевод Цельсия в Фаренгейты
        System.out.println("\n=== ЗАДАНИЕ 4 ===");

        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        scanner.close();
    }
}
