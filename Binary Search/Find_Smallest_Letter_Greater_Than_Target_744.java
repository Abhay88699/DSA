// Problem: 744. Find Next Greatest Letter

// Date Solved: 2025-06-18
// Submission: https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/16837226630
public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

