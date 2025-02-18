import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ступенек: ");
        int n = scanner.nextInt();
        scanner.close();

        int ways = climbStairs(n);
        System.out.println("Количество способов подняться: " + ways);
    }
}
