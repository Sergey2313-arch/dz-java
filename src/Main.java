import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        task1();
        System.out.println("\n=== Задание 2 ===");
        task2();
        System.out.println("\n=== Задание 3 ===");
        task3();
        System.out.println("\n=== Задание 4 ===");
        task4();
        System.out.println("\n=== Задание 5 ===");
        task5();
    }

    // Ввод массива: сначала n, потом n чисел
    static int[] readArray() {
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 1. Максимум и индекс первого вхождения
    static void task1() {
        int[] arr = readArray();
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // строго больше, чтобы остался ПЕРВЫЙ индекс
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимум: " + max + ", индекс: " + maxIndex);
    }

    // 2. Разворот массива на месте
    static void task2() {
        int[] arr = readArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 3. Слова до stop
    static void task3() {
        sc.nextLine();
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Вводите слова по одному (stop — конец):");
        while (true) {
            String word = sc.nextLine();
            if (word.equals("stop")) {
                break;
            }
            words.add(word);
        }
        System.out.println("Всего: " + words.size());
        for (String w : words) {
            if (w.length() > 4) {
                System.out.println(w);
            }
        }
    }

    // 4. Прямоугольник из символов
    static void printRectangle(int width, int height, char symbol) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    static void task4() {
        System.out.print("Ширина: ");
        int width = sc.nextInt();
        System.out.print("Высота: ");
        int height = sc.nextInt();
        System.out.print("Символ: ");
        char symbol = sc.next().charAt(0);
        printRectangle(width, height, symbol);
    }

    // 5. Среднее и элементы больше среднего
    static double average(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double) sum / arr.length;
    }

    static void task5() {
        int[] arr = readArray();
        double avg = average(arr);
        System.out.println(String.format(Locale.US, "Среднее: %.1f", avg));
        System.out.print("Больше среднего:");
        for (int x : arr) {
            if (x > avg) {
                System.out.print(" " + x);
            }
        }
        System.out.println();
    }
}