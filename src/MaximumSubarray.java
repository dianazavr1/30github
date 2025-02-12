public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Глобальный максимум
        int currentSum = nums[0]; // Текущая сумма подмассива

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Берем либо текущее число, либо продолжаем подмассив
            maxSum = Math.max(maxSum, currentSum); // Обновляем глобальный максимум
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Вывод: 6
    }
}
