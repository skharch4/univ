import java.util.Random;

public class Pr_2_3 {
    public static void main(String[] args) {
        // Координати квадрату
        int x1 = 50;
        int y1 = 30;
        int x2 = 30;
        int y2 = 50;

        // Створюємо об'єкт для генерації випадкових чисел
        Random random = new Random();

        // Генеруємо випадкові координати x та y у межах [x2, x1] та [y1, y2]
        int randomX = random.nextInt(x1 - x2 + 1) + x2;
        int randomY = random.nextInt(y2 - y1 + 1) + y1;

        // Виводимо випадкову географічну точку
        System.out.println("Випадкова географічна точка:");
        System.out.println("X: " + randomX);
        System.out.println("Y: " + randomY);
    }
}
