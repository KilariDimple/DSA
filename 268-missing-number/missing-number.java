class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total= n * (n + 1) / 2;
        int sum=0;
        int dim=0;
        for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];


        }
         dim=total-sum;
                return dim;
    }
    
}
