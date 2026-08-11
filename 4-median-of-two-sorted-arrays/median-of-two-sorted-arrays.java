class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            k++;
            j++;
        }
        double ans=0;
        if(arr.length%2!=0){
            // ans=n/2;
            ans=arr[n/2];
        }
        else{
            int s=n/2-1;
            ans=(arr[n/2]+arr[s])/2.0;
        }
        return ans;
    }
}