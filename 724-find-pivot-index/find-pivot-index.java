class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
         for(int num:nums){
            total+=num;
         }
         int leftSum=0;
         int ans=-1;
         for(int i=0;i<nums.length;i++){
            if(leftSum==total-leftSum-nums[i]){
                 return i;
            }
            leftSum+=nums[i];
            // else{
            //     ans=-1;
            // }
            // leftSum+=nums[i];
         }
         return ans;
    }
}