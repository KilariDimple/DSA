class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=-0;i<nums.length;i++){
            int val=nums[i];
            if(hm.containsKey(val)){
                int prev=hm.get(val);
                 if(i-prev <=k){
                    return true;
                 }
            }
            
            hm.put(val,i);
            
        }
            return false;
    }
}