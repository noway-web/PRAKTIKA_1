import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            System.exit(0);
        } else {
                int[] numbers = new int[size];

            // Ввод элементов массива с клавиатуры
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Вычисление суммы элементов с использованием цикла do-while
            int sumDoWhile = 0;
            int i = 0;
            do {
                sumDoWhile += numbers[i];
                i++;
            } while (i < size);

            // Вычисление суммы элементов с использованием цикла while
            int sumWhile = 0;
            int j = 0;
            while (j < size) {
                sumWhile += numbers[j];
                j++;
            }

            // Поиск максимального и минимального элементов
            int max = numbers[0];
            int min = numbers[0];
            for (int k = 1; k < size; k++) {
                if (numbers[k] > max) {
                    max = numbers[k];
                }
                if (numbers[k] < min) {
                    min = numbers[k];
                }
            }

            // Вывод результатов
            System.out.println("Сумма элементов массива (с do-while): " + sumDoWhile);
            System.out.println("Сумма элементов массива (с while): " + sumWhile);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);

            scanner.close();

        }
    }
}