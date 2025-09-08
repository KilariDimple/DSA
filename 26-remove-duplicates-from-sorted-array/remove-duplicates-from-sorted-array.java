class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int k=nums.length;
        for(int i=1;i<k;i++){
            if(nums[i]!=nums[j]){
                j++;
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

        }
        
        return j+1;
    }

    
}