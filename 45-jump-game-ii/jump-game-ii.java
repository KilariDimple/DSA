class Solution {
    public int jump(int[] nums) {

        int maxcnt = 0;
        int end = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            maxcnt = Math.max(maxcnt, i + nums[i]);

            if (i == end) {
                cnt++;
                end = maxcnt;
            }
        }

        return cnt;
    }
}