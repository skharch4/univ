public class Pr_2_1 {
    public static void main (String[ ] args) {
// оголошуємо і одразу ініціалізуємо
// координати вершин прямокутника
        double x1 = 2.3;
        double x2 = 5.2;
        double y1 = 1.0;
        double y2 = 3.5;
        double xm, ym;
// ініціалізуємо випадкові координати точки
// в межах прямокутника
        xm = x1 + (x2-x1)*Math.random();
        ym = y1 + (y2-y1)*Math.random();
// виводимо на екран координати точки М
        System.out.println("M(" + xm + "; "+ym+")");
    }}
