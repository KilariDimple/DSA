class Solution {
    public int trap(int[] height) {
         int n=height.length;
         int [] prefixMax=new int [n];
         int [] suffixMax=new int [n];
         // prefix max
         prefixMax[0]=height[0];
         for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
         }
         //sufix max
         suffixMax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            suffixMax[i]=Math.max(height[i],suffixMax[i+1]);
         }
         int total=0;
         for(int i=0;i<n;i++){
            int leftMax=prefixMax[i];
            int rigthMax=suffixMax[i];
            if(height[i]<leftMax&& height[i]<rigthMax){
                int ans=Math.min(leftMax,rigthMax)-height[i];
                total=total+ans;
            }
         }
         return total;

    }
}