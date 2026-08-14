class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int n = nums.length;
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                res[idx] = nums[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i] = res[i];
        }
    }
}