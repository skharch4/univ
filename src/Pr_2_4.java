import java.util.Scanner;
//Варіант 3
public class Pr_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину сторони a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть довжину сторони b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть довжину сторони c: ");
        double c = scanner.nextDouble();

        // Обчислюємо півпериметр трикутника
        double s = (a + b + c) / 2;

        // Обчислюємо радіус вписаного кола за формулою
        double R = Math.sqrt(((s - a) * (s - b) * (s - c)) / s);

        System.out.println("Радіус вписаного кола: " + R);

        scanner.close();
    }
}
