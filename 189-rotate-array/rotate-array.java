class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
            solve(nums,0,n-k-1);
            solve(nums,n-k,n-1);
            solve(nums,0,n-1);
    }
    public void solve(int[]arr,int i, int j){
        int a=0;
        while(i<j){
            a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i++;
            j--;
        }
    }
}