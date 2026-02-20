class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int k = n / 3;
        List<Integer> ans = new ArrayList<>();
        
        if (n == 1) {
            for (int num : nums) {
                ans.add(num);
            }
            return ans;
        } else {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (hm.containsKey(nums[i])) {
                    int prev = hm.get(nums[i]);
                    hm.put(nums[i], prev + 1);
                } else {
                    hm.put(nums[i], 1);
                }
            }

            for (int key : hm.keySet()) {
                int count = hm.get(key);

                if (count > n / 3) {
                    ans.add(key);
                }
            }

        }
        return ans;

    }
}