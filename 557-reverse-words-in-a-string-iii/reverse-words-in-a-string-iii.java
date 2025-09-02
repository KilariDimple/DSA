class Solution {
    public String reverseWords(String s) {
        String word="";
        String fin="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                word=ch+word;
            }
            else{
                fin=fin+word+" ";
                word="";
            }

        }
        fin=fin+word;
        return fin;
    }
}