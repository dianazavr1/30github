import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Последний элемент в nums1 (без учета нулей)
        int j = n - 1; // Последний элемент в nums2
        int k = m + n - 1; // Последний индекс массива nums1

        while (j >= 0) { // Пока не добавили все элементы из nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Ставим больший элемент в конец
                i--;
            } else {
                nums1[k] = nums2[j]; // Берем элемент из nums2
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // Основной массив
        int m = 3;
        int[] nums2 = {2, 5, 6}; // Второй массив
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1)); // Выведет: [1, 2, 2, 3, 5, 6]
    }
}
