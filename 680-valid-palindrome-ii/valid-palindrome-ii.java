class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        boolean ans = true;
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            
            }
            else{
                 ans=Palind(l+1,r,s) || Palind(l,r-1,s);
                //  l++;
                //  r--;
                return ans;
            }
        }
        return ans;
    }

    public static boolean Palind(int l,int r,String s){
        while(l<r){
            // char ch=s.charAt(i);
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}
