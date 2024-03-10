import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Output of numbers from 1 to 5
        System.out.println("Числа від 1 до 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. Output of numbers from 5 to 1
        System.out.println("\nЧисла від 5 до 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // 3. Display the multiplication table
        System.out.println("\nТаблиця множення:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // 4. We sum up the numbers from 1 to the number entered by the user
        System.out.print("\nВведіть позитивне число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сума чисел від 1 до " + n + " = " + sum);

        // 5. We ask to enter two numbers and display the result of their multiplication
        while (true) {
            System.out.print("\nВведіть перше число (або 1 для виходу): ");
            int num1 = scanner.nextInt();
            if (num1 == 1) {
                break; // якщо введено 1, завершуємо цикл
            }
            System.out.print("Введіть друге число: ");
            int num2 = scanner.nextInt();
            System.out.println("Результат множення: " + num1 * num2);
        }

        scanner.close();
    }
}


