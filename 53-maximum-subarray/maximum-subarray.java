class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curSum=0;
        // if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            curSum=curSum+nums[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
        
    }
}