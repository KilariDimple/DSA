class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] len = new int[n];
        int[] count = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            len[i] = 1;
            count[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {

                    if (len[j] + 1 > len[i]) {
                        len[i] = len[j] + 1;
                        count[i] = count[j];
                    }
                    else if (len[j] + 1 == len[i]) {
                        count[i] += count[j];
                    }
                }
            }

            max = Math.max(max, len[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (len[i] == max) {
                result += count[i];
            }
        }

        return result;
    }
}