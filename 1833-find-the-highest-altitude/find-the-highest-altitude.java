class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        int ans=0;
        for(int nums:gain){
            sum=sum+nums;
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}