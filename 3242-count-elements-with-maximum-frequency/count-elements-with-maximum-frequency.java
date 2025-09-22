class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int prev=hm.get(nums[i]);
                hm.put(nums[i],prev+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int maxfreq=0;
        int total=0;
        for(int count : hm.values()){
            if(count>maxfreq){
                maxfreq=count;
                total=count;
            }
            else if(count==maxfreq){
                    total+=count;
            }
        }
        return total;
    }
}