class Solution {
    public String largestOddNumber(String num) {
        int ans=-1;
        String fin="";
        if((num.charAt(num.length()-1)-'0')%2!=0){
            fin=num;
            return fin;
        }
        for(int i=0;i<num.length();i++){
             char ch=num.charAt(i);
             if((ch-'0')%2!=0){
                // if((ch-'0')>ans){
                    ans=i;
                // }
             }
        }
        fin = num.substring(0, ans+1);
        return fin;
    }
}