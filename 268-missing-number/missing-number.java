class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x = 0;

        // First: iterate over every element of array
        for (int c : nums) {
            x = x ^ c;
        }

        // Second: iterate from 0 to n
        for (int i = 0; i <= n; i++) {
            x = x ^ i;
        }

        return x;
    }
}