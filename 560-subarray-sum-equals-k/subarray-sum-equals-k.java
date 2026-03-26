class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum=sum+nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;



         HashMap<Integer,Integer> hm= new HashMap<>();
                 int sum=0;
         int count=0;
         hm.put(0,1);
         for(int num:nums){
            sum=sum+num;
            if(hm.containsKey(sum-k)){
                count=count+hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                int prev=hm.get(sum);
                hm.put(sum,prev+1);
            }
             else{
                hm.put(sum,1);
             }
         }
         return count;
    }
}