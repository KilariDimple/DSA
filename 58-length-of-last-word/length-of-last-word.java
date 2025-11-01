class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        // int last=s.lastIndexOf(' ');
        // int fin=s.length()-last-1;
        // return fin;
int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch!=' '){
                count++;
            }
            else{
                count=0;
            }

        }
        return count;
    }
}