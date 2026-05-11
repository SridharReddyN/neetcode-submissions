class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum < target) {
                left++;
                continue;
            } else if (currentSum > target) {
                right--;
                continue;
            } else {
                break;
            }
        }
        int[] result = {left + 1, right + 1};
        return result;
    }
}
