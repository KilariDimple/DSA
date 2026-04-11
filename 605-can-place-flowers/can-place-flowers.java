class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=1;
        boolean
         ans=false;
         int k=000;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                count++;
                if(count==3){
                    k++;
                    count=1;
                }
            }
            else{
                count =0;
            }
        }
        if(count==2){
            k++;
        }
        if(k>=n){
            ans=true;
        }
        return ans;
        
    }
}