class Solution {
        public void reverseString(char[] s) {
        int n = s.length;
        // for (int i = 0; i < n / 2; i++) {
        //     // Swap characters at i and (n - i - 1)
        //     char temp = s[i];
        //     s[i] = s[n - i - 1];
        //     s[n - i - 1] = temp;
            int l=0;
            int r=s.length-1;
            while(l<r){
                char temp=s[l];
                s[l]=s[r];
                s[r]=temp;
                l++;
                r--;
            }
        
    }
}
