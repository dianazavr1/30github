import java.util.Arrays;

public class BigONotationExamples {

    // O(1) - Константное время
    static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // O(log n) - Логарифмическое время (Бинарный поиск)
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // O(n) - Линейное время (Линейный поиск)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // O(n log n) - Быстрая сортировка (через Arrays.sort)
    static void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    // O(n^2) - Квадратичное время (Сортировка пузырьком)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        // O(1) - Получение первого элемента
        System.out.println("Первый элемент: " + getFirstElement(arr));

        // O(n) - Линейный поиск
        System.out.println("Линейный поиск (8): " + linearSearch(arr, 8));

        // O(n log n) - Быстрая сортировка
        quickSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        // O(log n) - Бинарный поиск (после сортировки!)
        System.out.println("Бинарный поиск (8): " + binarySearch(arr, 8));

        // O(n^2) - Сортировка пузырьком (на неотсортированном массиве)
        int[] unsortedArr = {5, 3, 8, 1, 2};
        bubbleSort(unsortedArr);
        System.out.println("Пузырьковая сортировка: " + Arrays.toString(unsortedArr));
    }
}
