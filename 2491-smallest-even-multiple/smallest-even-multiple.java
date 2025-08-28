class Solution {
    public int smallestEvenMultiple(int n) {
        int min = n * 2;
        for(int i=1; i <= n; i ++){
            if(i%n==0 && i%2==0){
                if(i<=min){
                    min=i;
                }
            }
        }
        return min;
    }
}