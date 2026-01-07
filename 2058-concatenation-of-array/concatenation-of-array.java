class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int d=2*n;
        int arr[]=new int [d];
        for(int i=0;i<nums.length;i++){
                arr[i]=nums[i];
                arr[i+nums.length]=nums[i];
        }
        return arr;
        
    }
}