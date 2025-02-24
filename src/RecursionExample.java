public class RecursionExample {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumRecursive(n);
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
}
//qwer