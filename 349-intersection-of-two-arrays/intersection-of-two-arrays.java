class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            if (hm.containsKey(val)) {
                hm.put(val, hm.get(val) + 1);
            } 
            else {
                hm.put(val, 1);
            }
      }
             ArrayList <Integer> result =new ArrayList<>();
        for(int i=0;i<nums2.length;i++ ){
            int val=nums2[i];
            if(!result.contains(val)){
              if(hm.containsKey(val)){
                result.add(val);
                hm.get(val);
            }
            }
        
        }
            int arr[]=new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
return arr;
    }
}