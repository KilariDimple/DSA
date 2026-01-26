class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             int ch=nums[i];
            if(hm.containsKey(ch)){
                int prev=hm.get(ch);
                hm.put(ch,prev+1);
            }
            else{
                hm.put(ch,1);
            }
        }
int ans=0;
int resultKey=0;
for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
    if (entry.getValue()==1) {
         resultKey = entry.getKey();
        ans=resultKey;
    }
}
return resultKey;

        
    }
}