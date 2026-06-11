class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int ans=0;
        // if(a==b) ans=a;
        // if(a>b){
        //     ans=a;
        // }
        // else{
        //     ans=b;
        // }
        int l=0;
        int r=0;
           while (l < a && r < b) {
            if(nums1[l]==nums2[r]){
                return nums1[l];
            }
            if(nums1[l]<nums2[r]){
                l++;
            }
            else{
                r++;
            }

        }
        return -1;
    }
}