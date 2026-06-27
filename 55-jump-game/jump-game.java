class Solution {
    public boolean canJump(int[] nums) {
        boolean ans=false;
        int maxcnt=0;
        int n=nums.length;
        int cur_cnt=0;
        for(int i=0;i<n;i++){
            if(i>maxcnt) return false;
            cur_cnt=i+nums[i];
            maxcnt=Math.max(cur_cnt,maxcnt);
            if(maxcnt>=n-1 ){
                ans=true;
                break;
            }
        }
        return ans;
    }
}