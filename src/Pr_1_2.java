public class Pr_1_2 {
    public static void main(String[] args) {
        int n = 10; // Розмір таблиці множення

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                System.out.println(i + "x" + j + "=" + result);
            }
        }
    }
}
