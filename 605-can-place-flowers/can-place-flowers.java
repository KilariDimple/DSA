class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=1;
        boolean
         ans=false;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                count++;
                if(count==3){
                    n--;
                    count=1;
                }
            }
            else{
                count =0;
            }
        }
        if(count==2){
            n--;
        }
        if(n<=0){
            ans=true;
        }
        return ans;
        
    }
}