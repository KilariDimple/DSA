class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        int i=0;
        for(int nums:nums1){
            arr[i]=nums;
            i++;    
        }
        for(int nums:nums2){
            arr[i]=nums;
            i++;
        }
        Arrays.sort(arr);
        double ans=0;
        if(arr.length%2!=0){
            // ans=n/2;
            ans=arr[n/2];
        }
        else{
            int k=n/2-1;
            ans=(arr[n/2]+arr[k])/2.0;
        }
        return ans;
    }
}