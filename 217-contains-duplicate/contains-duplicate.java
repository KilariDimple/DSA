class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                ans=true;
                return ans;
                // int prev=hm.get(arr[i]);
                // hm.put
            }
            else{
                hm.put(nums[i],1);
            }
        }
        return ans;
    }
}