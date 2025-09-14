class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer>hash=new HashMap<>();
    int ans=0;
    for(int i=0;i<nums.length;i++){
        int n=nums[i];
        if(hash.containsKey(n)){
            ans=ans+hash.get(n);
            int prev=hash.get(n);
            hash.put(n,prev+1);
         
        }
        else{
            hash.put(n,1);
            
        }

    }
return ans;
    }
}