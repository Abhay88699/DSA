public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target)  left = mid + 1;
            else                     right = mid - 1;
        }
        return left;
    }
}
