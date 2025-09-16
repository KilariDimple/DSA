class Solution {
    public boolean check(int[] nums) {
        int count = 0; // to count how many times order breaks
        
        for (int i = 0; i < nums.length; i++) {
            // compare current element with next (circular using %)
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            // If order breaks more than once, it's not sorted and rotated
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
