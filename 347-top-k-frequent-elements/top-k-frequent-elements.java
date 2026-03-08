import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Integer> hm = new TreeMap<>();
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();

        // count frequency
        for(int i=0;i<nums.length;i++){

            if(hm.containsKey(nums[i])){
                int prev = hm.get(nums[i]);
                hm.put(nums[i], prev+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }

        // store entries in list
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            list.add(entry);
        }

        // sort by frequency descending
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());

        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}