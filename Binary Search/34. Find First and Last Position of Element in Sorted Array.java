public class FirstAndLastPosition_34 {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }

    private int findBound(int[] nums, int target, boolean first) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (first) right = mid - 1;
                else       left  = mid + 1;
            } else if (nums[mid] < target) left = mid + 1;
            else                           right = mid - 1;
        }
        return ans;
    }
}
