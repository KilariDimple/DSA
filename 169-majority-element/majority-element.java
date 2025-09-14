class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length/2;
        int ans=0;
        // int count=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=00;i<nums.length;i++){
            int n=nums[i];
            if(hash.containsKey(n)){
                int prev=hash.get(n);
                hash.put(n,prev+1);
            }
            else{
                hash.put(n,1);
            }        
        }
        for( int count:hash.keySet()){
             int arr=hash.get(count);
            if(arr>l){
                ans=count;
                break;
            }
        }
return ans;
    }
}