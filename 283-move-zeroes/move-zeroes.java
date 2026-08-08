class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;

        // Step 1: find first zero
        int i = -1;
        for(int j = 0; j < n; j++){
            if(nums[j] == 0){
                i = j;
                break;
            }
        }

        if(i == -1) return;

        // Step 2: move non-zero elements forward
        for(int j = i + 1; j < n; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}