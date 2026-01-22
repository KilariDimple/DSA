class Solution {
    public void sortColors(int[] nums) {
        int k=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                i=-1;
            }
        }
       
    }
}