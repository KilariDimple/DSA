class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
            for(int j=i+1;j<i+nums.length;j++){
                int index=j%nums.length;
                if(nums[index]>nums[i]){
                    res[i]=nums[index];
                    break;
                }
                // else{
                //     res[i]=-1;
                // }
            }
        }
        return res;
    }
}