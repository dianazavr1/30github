public class SumArray {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static int sumRecursive(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sum(arr));
        System.out.println("Sum (Recursive): " + sumRecursive(arr, 0));
    }
}
