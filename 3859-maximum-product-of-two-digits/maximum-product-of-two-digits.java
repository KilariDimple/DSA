class Solution {
    public int maxProduct(int n) {
        int count = Integer.toString(n).length();
        int arr[]=new int[count];
        int s=n;
        int i=0;
        while(s>0){
            int k=s%10;
            arr[i]=k;
            s=s/10;
            i++;
        }
        Arrays.sort(arr);
        return arr[count-1]*arr[count-2];
        
    }
}