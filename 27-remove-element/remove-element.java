class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // k keeps track of elements not equal to val
        
        // Loop through all elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Keep elements that are not val
                k++;
            }
        }
        
        return k; // Return the count of elements not equal to val
    }
}
