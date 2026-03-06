class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>st= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=-(nums[i]+nums[j]);
                if(hs.contains(k)){
                    List<Integer>ls=new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(k);
                    ls.add(nums[j]);
                    Collections.sort(ls);
                    st.add(ls);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }
}