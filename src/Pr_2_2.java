import java.util.*;
public class Pr_2_2 {
    public static void main (String [ ] args) {
// оголошення і створення об'єкту для сканування клавіатури
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Введіть ціле число: ");
        n = scan.nextInt();
        System.out.println("Число "+2*n+" у 2 рази більше вашого.");
        double x;
        System.out.println("Введіть дробове число: ");
        x = scan.nextDouble();
        System.out.println("Число "+x/3+" у 3 менше вашого.");
        String s;
        System.out.println("Введіть ваше ім'я: ");
        s = scan.next();
        System.out.println("Дуже приємно, "+s);
    }}
